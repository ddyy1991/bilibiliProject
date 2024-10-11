package me.liujia95.biliplayer.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;
import me.liujia95.biliplayer.bean.FenquBean;
import me.liujia95.biliplayer.utils.UIUtils;

/**
 * Created by Administrator on 2016/1/14 10:17.
 */
public class FenquViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView mIcon;
    TextView mTv;


    public FenquViewHolder(View itemView) {
        super(itemView);
        mTv=itemView.findViewById(R.id.item_fenqu_tv);
        mIcon=itemView.findViewById(R.id.item_fenqu_icon);
        itemView.setOnClickListener(this);
    }

    public void loadData(FenquBean fenquBean) {
        mIcon.setImageResource(fenquBean.icon);
        mTv.setText(fenquBean.title);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(UIUtils.getContext(), mTv.getText(), Toast.LENGTH_SHORT).show();
    }
}
