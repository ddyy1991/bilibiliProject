package me.liujia95.biliplayer.viewholder;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;

/**
 * Created by Administrator on 2016/1/14 16:13.
 */
public class FaxianBottomViewHolder extends RecyclerView.ViewHolder {
    ImageView  mDiscoveryNew;

    public FaxianBottomViewHolder(View itemView) {
        super(itemView);
        mDiscoveryNew=itemView.findViewById(R.id.faxian_bottom_discovery_new);
        //设置动画
        AnimationDrawable ad = (AnimationDrawable) mDiscoveryNew.getBackground();
        ad.start();


    }

}
