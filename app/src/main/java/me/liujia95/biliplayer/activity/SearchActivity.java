package me.liujia95.biliplayer.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;
import me.liujia95.biliplayer.base.BaseActivity;

/**
 * Created by Administrator on 2016/1/14 19:13.
 */
public class SearchActivity extends BaseActivity implements View.OnClickListener {

    ImageView    mIvBack;
    ImageView    mIvScan;
    EditText     mEt;
    ImageView    mIvClose;
    ImageView    mIvSearch;
    RecyclerView mRecyclerview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFinishOnTouchOutside(true);
        setContentView(R.layout.activity_search);
        findView();
        initListener();
    }

    private void findView() {
        mIvBack=findViewById(R.id.search_iv_back);
        mIvScan=findViewById(R.id.search_iv_scan);
        mEt=findViewById(R.id.search_et);
        mIvClose=findViewById(R.id.search_iv_close);
        mIvSearch=findViewById(R.id.search_iv_search);
        mRecyclerview=findViewById(R.id.search_recyclerview);
    }

    private void initListener() {
        mIvBack.setOnClickListener(this);
        mIvScan.setOnClickListener(this);
        mIvClose.setOnClickListener(this);
        mIvSearch.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }
}
