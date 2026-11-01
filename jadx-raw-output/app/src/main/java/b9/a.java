package b9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.adapter.BannerViewHolder;
import em.o;
import ib.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MyBannerAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<RecommandVideosEntity> f5297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5298b;

    /* JADX INFO: renamed from: b9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MyBannerAdapter.java */
    public class C0016a extends BannerViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f5299l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f5300m;

        public C0016a(View view) {
            super(view);
            this.f5299l = (ImageView) view.findViewById(R.id.item_img);
            this.f5300m = (TextView) view.findViewById(R.id.tv_title);
        }
    }

    @Override // cb.a
    public void a(BannerViewHolder bannerViewHolder, int i10) {
        C0016a c0016a = (C0016a) bannerViewHolder;
        if (o.b(this.f5297a.get(i10).getCoverUrl())) {
            c0016a.f5299l.setImageResource(R.drawable.ic_video_default_horizontal);
        } else {
            d.c(this.f5298b, this.f5297a.get(i10).getCoverUrl(), R.drawable.ic_video_default_horizontal, R.drawable.ic_video_default_horizontal, c0016a.f5299l, false);
        }
        c0016a.f5300m.setText(this.f5297a.get(i10).getName());
    }

    @Override // cb.a
    public BannerViewHolder b(ViewGroup viewGroup, int i10) {
        return new C0016a(LayoutInflater.from(this.f5298b).inflate(R.layout.home_banner_item, viewGroup, false));
    }

    @Override // cb.a
    public int getCount() {
        return this.f5297a.size();
    }

    public a(Context context, List<RecommandVideosEntity> list) {
        new ArrayList();
        this.f5298b = context;
        this.f5297a = list;
    }
}
