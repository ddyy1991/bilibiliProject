package me.liujia95.biliplayer.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;
import me.liujia95.biliplayer.bean.VideoInfoBean;

/**
 * Created by Administrator on 2016/1/14 22:29.
 */
public class WanJieViewHolder extends RecyclerView.ViewHolder {

    public ImageView mIvIcon;
    TextView mTvTitle;
    TextView mTvNumber;
    public ImageView mIvIcon2;
    TextView mTvTitle2;
    TextView mTvNumber2;
    public ImageView mIvIcon3;
    TextView mTvTitle3;
    TextView mTvNumber3;

    public WanJieViewHolder(View itemView) {
        super(itemView);
        mIvIcon=itemView.findViewById(R.id.wanjie_iv_icon);
        mTvNumber=itemView.findViewById(R.id.wanjie_tv_number);
        mIvIcon2=itemView.findViewById(R.id.wanjie_iv_icon2);
        mTvTitle2=itemView.findViewById(R.id.wanjie_tv_title2);
        mTvTitle=itemView.findViewById(R.id.wanjie_tv_title);
        mTvNumber2=itemView.findViewById(R.id.wanjie_tv_number2);
        mIvIcon3=itemView.findViewById(R.id.wanjie_iv_icon3);
        mTvTitle3=itemView.findViewById(R.id.wanjie_tv_title3);
        mTvNumber3=itemView.findViewById(R.id.wanjie_tv_number3);
    }

    public void loadData(VideoInfoBean bean) {
        mIvIcon.setImageResource(bean.icon1);
        mIvIcon2.setImageResource(bean.icon2);
        mIvIcon3.setImageResource(bean.icon3);

        mTvTitle.setText(bean.title1);
        mTvTitle2.setText(bean.title2);
        mTvTitle3.setText(bean.title3);

        mTvNumber.setText(bean.number1);
        mTvNumber2.setText(bean.number2);
        mTvNumber3.setText(bean.number3);
    }
}
