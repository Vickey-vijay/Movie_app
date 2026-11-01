package com.mgs.carparking.widgets.viewpager;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import ib.d;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GalleryAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<RecommandVideosEntity> f42898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f42899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f42900d;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42901b;

        public a(int i10) {
            this.f42901b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.i("wangyi", "点击了");
            b bVar = GalleryAdapter.this.f42900d;
            if (bVar != null) {
                bVar.a(this.f42901b);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void a(b bVar) {
        this.f42900d = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f42898b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f42899c).inflate(R.layout.item_home_multiple_gallery_item_content, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.item_img);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        textView.setText(this.f42898b.get(i10).getName());
        d.c(this.f42899c, this.f42898b.get(i10).getCoverUrl(), R.drawable.ic_video_default, R.drawable.ic_video_default, imageView, false);
        viewInflate.setOnClickListener(new a(i10));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    public GalleryAdapter(Context context, List<RecommandVideosEntity> list) {
        this.f42899c = context;
        this.f42898b = list;
    }
}
