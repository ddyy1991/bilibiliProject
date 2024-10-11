package me.liujia95.biliplayer.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;
import me.liujia95.biliplayer.bean.LianZaiBean;
import me.liujia95.biliplayer.bean.VideoInfoBean;

/**
 * Created by Administrator on 2016/1/10 15:03.
 */
public class LianZaiViewHolder extends RecyclerView.ViewHolder {


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

    private LianZaiBean mLianZaiBean;

    public LianZaiViewHolder(View parent) {
        super(parent);
        mIcon=parent.findViewById(R.id.item_lianzai_icon);
        mSeenum=parent.findViewById(R.id.item_lianzai_seenum);
        mTitle=parent.findViewById(R.id.item_lianzai_title);
        mNumber=parent.findViewById(R.id.item_lianzai_number);
        mIcon2=parent.findViewById(R.id.item_lianzai_icon2);
        mSeenum2=parent.findViewById(R.id.item_lianzai_seenum2);
        mTitle2=parent.findViewById(R.id.item_lianzai_title2);
        mNumber2=parent.findViewById(R.id.item_lianzai_number2);
        mDate2=parent.findViewById(R.id.item_lianzai_date2);
        mDate=parent.findViewById(R.id.item_lianzai_date);

    }

    public void loadData(VideoInfoBean bean) {

        mIcon.setImageResource(bean.icon1);
        mSeenum.setText(bean.seeNum1);
        mTitle.setText(bean.title1);
        mNumber.setText(bean.number1);
        mDate.setText(bean.date1);

        mIcon2.setImageResource(bean.icon2);
        mSeenum2.setText(bean.seeNum2);
        mTitle2.setText(bean.title2);
        mNumber2.setText(bean.number2);
        mDate2.setText(bean.date2);
    }
}
