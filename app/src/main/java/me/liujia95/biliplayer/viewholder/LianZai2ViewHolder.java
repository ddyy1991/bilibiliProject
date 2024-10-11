package me.liujia95.biliplayer.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;
import me.liujia95.biliplayer.bean.LianZaiBean;
import me.liujia95.biliplayer.utils.UIUtils;

/**
 * Created by Administrator on 2016/1/10 15:03.
 */
public class LianZai2ViewHolder extends RecyclerView.ViewHolder {

    ImageView mIcon;
    TextView  mSeenum;
    TextView  mTitle;
    TextView  mNumber;
    TextView  mDate;
    ImageView mIcon2;
    TextView  mSeenum2;
    TextView  mTitle2;
    TextView  mNumber2;
    TextView  mDate2;
    private final BitmapUtils mBitmapUtils;

    public LianZai2ViewHolder(View parent) {
        super(parent);
        mIcon=parent.findViewById(R.id.item_lianzai_icon);
        mSeenum=parent.findViewById(R.id.item_lianzai_seenum);
        mTitle=parent.findViewById(R.id.item_lianzai_title);
        mNumber=parent.findViewById(R.id.item_lianzai_number);
        mDate=parent.findViewById(R.id.item_lianzai_date);
        mIcon2=parent.findViewById(R.id.item_lianzai_icon2);
        mSeenum2=parent.findViewById(R.id.item_lianzai_seenum2);
        mTitle2=parent.findViewById(R.id.item_lianzai_title2);
        mNumber2=parent.findViewById(R.id.item_lianzai_number2);
        mDate2=parent.findViewById(R.id.item_lianzai_date2);
        mBitmapUtils = new BitmapUtils(UIUtils.getContext());
    }


    public void loadData(LianZaiBean bean) {
        mBitmapUtils.display(mIcon, bean.pic);
        mSeenum.setText(bean.seeNum);
        mTitle.setText(bean.title);
        mNumber.setText(bean.number);
        mDate.setText(bean.data);

        mBitmapUtils.display(mIcon2, bean.pic2);
        mSeenum2.setText(bean.seeNum2);
        mTitle2.setText(bean.title2);
        mNumber2.setText(bean.number2);
        mDate2.setText(bean.data2);
    }
}
