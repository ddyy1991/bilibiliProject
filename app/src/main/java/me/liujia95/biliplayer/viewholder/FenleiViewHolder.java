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
 * Created by Administrator on 2016/1/15 9:42.
 */
public class FenleiViewHolder extends RecyclerView.ViewHolder {

    ImageView mIcon;
    TextView  mTitle;
    ImageView mIcon2;
    TextView  mTitle2;
    ImageView mIcon3;
    TextView  mTitle3;

    public FenleiViewHolder(View itemView) {
        super(itemView);
        mIcon=itemView.findViewById(R.id.fenlei_icon);
        mTitle=itemView.findViewById(R.id.fenlei_title);
        mIcon2=itemView.findViewById(R.id.fenlei_icon2);
        mTitle2=itemView.findViewById(R.id.fenlei_title2);
        mIcon3=itemView.findViewById(R.id.fenlei_icon3);
        mTitle3=itemView.findViewById(R.id.fenlei_title3);
    }


    public void loadData(VideoInfoBean bean) {
        mIcon.setImageResource(bean.icon1);
        mIcon2.setImageResource(bean.icon2);
        mIcon3.setImageResource(bean.icon3);

        mTitle.setText(bean.title1);
        mTitle2.setText(bean.title2);
        mTitle3.setText(bean.title3);
    }
}
