package me.liujia95.biliplayer.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.liujia95.biliplayer.R;
import me.liujia95.biliplayer.bean.LunboBean;
import me.liujia95.biliplayer.protocol.PanJuLunboProtocol;
import me.liujia95.biliplayer.view.MyViewPager;

/**
 * Created by Administrator on 2016/1/20 12:26.
 */
public class LunboViewHolderTest extends RecyclerView.ViewHolder {
    private PanJuLunboProtocol mProtocol;
    private LunboBean          mLunboBean;

    public LunboViewHolderTest(View itemView, ViewGroup parent) {
        super(itemView);
        mProtocol = new PanJuLunboProtocol();
        try {
            mLunboBean = mProtocol.loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
