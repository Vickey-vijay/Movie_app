package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes6.dex */
public class t extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public volatile sg.bigo.ads.ad.b.b f68936c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f68938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f68939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f68940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bitmap f68941h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f68944k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<v> f68945l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f68946m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f68947n = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f68942i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f68943j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f68937d = new d();

    public interface a {
        Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2);
    }

    public t(@NonNull sg.bigo.ads.ad.b.b bVar) {
        this.f68936c = bVar;
    }

    public static void a(@Nullable View view) {
        AdOptionsView adOptionsView;
        if (view == null || (adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options)) == null) {
            return;
        }
        adOptionsView.setVisibility(adOptionsView.findViewWithTag("ad_options_real_view") == null ? 8 : 0);
    }

    private static void a(a aVar, @NonNull TextView textView, @Nullable String str, @Nullable String str2) {
        Pair<String, String> pairA;
        if (aVar != null && (pairA = aVar.a(textView, str, str2)) != null) {
            str = (String) pairA.first;
            str2 = (String) pairA.second;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }

    private synchronized void a(@NonNull v vVar) {
        if (this.f68940g != null) {
            vVar.a();
            return;
        }
        this.f68945l.add(vVar);
        if (this.f68944k == 1) {
            return;
        }
        this.f68944k = 1;
        b(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.t.11
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                t.this.a(bitmap);
            }
        });
    }

    private synchronized void b(final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f68936c.f();
        if (!aVar.aR()) {
            String strAT = aVar.aT();
            if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.common.p.e.a(this.f68936c.f67537b.f69380e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.14
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String strB = sg.bigo.ads.common.o.b(this.f68936c.f67537b.f69380e, aVar.aN());
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(strB).getPath();
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.13
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), t.this.f68936c.f67537b.f69380e));
                }
            });
        }
    }

    public final synchronized void a(@Nullable Bitmap bitmap) {
        this.f68940g = bitmap;
        Iterator<v> it = this.f68945l.iterator();
        while (it.hasNext()) {
            it.next().a();
            it.remove();
        }
        this.f68944k = 2;
    }

    public void a(@NonNull final ViewGroup viewGroup) {
        this.f68947n = true;
        a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.3
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                Integer numA = sg.bigo.ads.common.w.b.a(t.this.f68940g);
                if (numA != null) {
                    t.this.f68937d.a(numA.intValue());
                }
                t.this.b(viewGroup);
            }
        });
    }

    public final void a(@NonNull final ViewGroup viewGroup, final int i10) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.5
            @Override // java.lang.Runnable
            @RequiresApi(api = 17)
            public final void run() {
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    t.this.f68939f = (ImageView) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        t.this.f68939f = new ImageView(context);
                        t.this.f68939f.setTag("adview_background_main_tag");
                        t.this.f68939f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(t.this.f68939f, viewGroup, null, 0);
                    }
                }
                ImageView imageView = t.this.f68939f;
                if (imageView != null) {
                    imageView.setBackgroundColor(i10);
                }
            }
        });
    }

    public void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i10, int i11, int i12, @Nullable View... viewArr) {
        a(viewGroup, view, null, i10, i11, i12, viewArr);
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [sg.bigo.ads.api.core.b] */
    public void a(@NonNull ViewGroup viewGroup, @NonNull View view, a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        ArrayList arrayList = new ArrayList();
        sg.bigo.ads.api.core.b.d popPage = this.f68936c.getPopPage();
        TextView textView = (TextView) view.findViewById(R.id.inter_title);
        if (textView != null) {
            textView.setTag(2);
            a(aVar, textView, this.f68936c.getTitle(), popPage == null ? "" : popPage.b());
            arrayList.add(textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
        if (textView2 != null) {
            textView2.setTag(6);
            a(aVar, textView2, this.f68936c.getDescription(), popPage == null ? "" : popPage.c());
            arrayList.add(textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.inter_warning);
        if (textView3 != null) {
            textView3.setTag(8);
            String warning = this.f68936c.getWarning();
            if (TextUtils.isEmpty(warning)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(warning);
            }
            arrayList.add(textView3);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.inter_btn_cta);
        if (textView4 != null) {
            textView4.setTag(7);
            a(aVar, textView4, this.f68936c.getCallToAction(), "");
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.inter_btn_cta_main);
        if (textView5 != null) {
            textView5.setTag(7);
            a(aVar, textView5, sg.bigo.ads.common.utils.a.a(textView5.getContext(), R.string.bigo_ad_cta_default, new Object[0]), "");
            arrayList.add(textView5);
        }
        final ImageView imageView = (ImageView) view.findViewById(R.id.inter_end_page_image);
        if (imageView != null) {
            imageView.setTag(5);
            final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.t.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    final Bitmap bitmap2 = bitmap;
                    imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            };
            Bitmap bitmap = this.f68941h;
            if (bitmap != null) {
                valueCallback.onReceiveValue(bitmap);
            } else {
                a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.7
                    @Override // sg.bigo.ads.ad.interstitial.v
                    public final void a() {
                        valueCallback.onReceiveValue(t.this.f68940g);
                    }
                });
            }
        }
        TextView textView6 = (TextView) view.findViewById(R.id.inter_company);
        if (textView6 != null) {
            textView6.setTag(26);
            if (popPage == null || sg.bigo.ads.common.utils.q.a((CharSequence) popPage.f())) {
                textView6.setVisibility(8);
            } else {
                a(aVar, textView6, popPage.f(), "");
            }
            arrayList.add(textView6);
        }
        TextView textView7 = (TextView) view.findViewById(R.id.inter_star_num);
        View viewFindViewById = view.findViewById(R.id.inter_star_layout);
        if (textView7 != null && viewFindViewById != null) {
            viewFindViewById.setTag(26);
            textView7.setText(sg.bigo.ads.ad.b.e.c(((sg.bigo.ads.core.a.a) this.f68936c.f()).n()));
            arrayList.add(viewFindViewById);
        }
        TextView textView8 = (TextView) view.findViewById(R.id.inter_commit_num);
        if (textView8 != null) {
            textView8.setTag(26);
            textView8.setText(sg.bigo.ads.ad.b.e.b(((sg.bigo.ads.core.a.a) this.f68936c.f()).n()) + Z7.f27998r + sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.string.bigo_ad_comment_num_text, new Object[0]));
            arrayList.add(textView8);
        }
        TextView textView9 = (TextView) view.findViewById(R.id.inter_download_num);
        View viewFindViewById2 = view.findViewById(R.id.inter_download_num_layout);
        if (textView9 != null && viewFindViewById2 != null) {
            viewFindViewById2.setTag(26);
            textView9.setText(sg.bigo.ads.ad.b.e.a(((sg.bigo.ads.core.a.a) this.f68936c.f()).n()));
            arrayList.add(viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.inter_everyone_layout);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setTag(26);
            arrayList.add(viewFindViewById3);
        }
        this.f68938e = (ImageView) view.findViewById(R.id.inter_icon);
        AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
        MediaView mediaView = (MediaView) view.findViewById(R.id.inter_media);
        this.f68936c.H = i12;
        this.f68936c.a(viewGroup, mediaView, this.f68938e, adOptionsView, (List<View>) arrayList, i11, viewArr);
        if (this.f68938e == null || this.f68936c.hasIcon()) {
            return;
        }
        String strA = popPage != null ? popPage.a() : "";
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) strA) && URLUtil.isNetworkUrl(strA)) {
            if (!sg.bigo.ads.api.a.i.f69318a.n().a(9) || !URLUtil.isHttpUrl(strA)) {
                sg.bigo.ads.common.p.e.b(this.f68936c.f67537b.f69380e, null, strA, ((sg.bigo.ads.core.a.a) this.f68936c.f()).al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.8
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i13, @NonNull String str, String str2) {
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.common.p.f fVar) {
                        ImageView imageView2 = t.this.f68938e;
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(bitmap2);
                        }
                    }
                });
                return;
            } else {
                if (this.f68936c == null || this.f68936c.f() == 0) {
                    return;
                }
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f68936c.f(), 3000, 10220, "Invalid http url: ".concat(String.valueOf(strA)));
                return;
            }
        }
        if (i10 == 2) {
            this.f68938e.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f68938e.getContext(), R.drawable.bigo_ad_icon_default));
        } else if (i10 == 1) {
            a(this.f68938e);
        } else if (i10 == 3) {
            this.f68938e.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f68938e.getContext(), R.drawable.bigo_ad_icon_novideo_default));
        }
    }

    public final synchronized void a(final ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.12
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                valueCallback.onReceiveValue(t.this.f68940g);
            }
        });
    }

    public final void a(@NonNull final ImageView imageView) {
        this.f68946m = true;
        a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.2
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.2.1
                    @Override // java.lang.Runnable
                    @RequiresApi(api = 17)
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        imageView.setImageBitmap(t.this.f68940g);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                });
            }
        });
    }

    public void b(@NonNull final ViewGroup viewGroup) {
        sg.bigo.ads.common.utils.d.a(viewGroup.getContext(), this.f68940g, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.t.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    t.this.f68939f = (ImageView) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        t.this.f68939f = new ImageView(context);
                        t.this.f68939f.setTag("adview_background_main_tag");
                        t.this.f68939f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(t.this.f68939f, viewGroup, null, 0);
                    }
                }
                ImageView imageView = t.this.f68939f;
                if (imageView == null || bitmap2 == null) {
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                t.this.f68939f.setImageBitmap(bitmap2);
            }
        });
    }

    public final void d() {
        if (this.f68940g == null) {
            ImageView imageView = this.f68938e;
            if (imageView != null && this.f68946m) {
                a(imageView);
            }
            if (this.f68939f == null || !this.f68947n) {
                return;
            }
            a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.9
                @Override // sg.bigo.ads.ad.interstitial.v
                public final void a() {
                    final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(t.this.f68939f.getContext(), t.this.f68940g);
                    t.this.f68939f.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.this.f68939f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.d.a(t.this.f68939f, bitmapB);
                        }
                    });
                }
            });
        }
    }

    @NonNull
    public d e() {
        return this.f68937d;
    }

    public void f() {
    }

    @Nullable
    public final synchronized Bitmap g() {
        Bitmap bitmap = this.f68941h;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.f68941h;
    }

    @NonNull
    public final synchronized sg.bigo.ads.common.p h() {
        Bitmap bitmap = this.f68941h;
        if (bitmap != null) {
            return new sg.bigo.ads.common.p(bitmap.getWidth(), this.f68941h.getHeight());
        }
        return new sg.bigo.ads.common.p(-1, -1);
    }

    public final synchronized void i() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f68936c.f();
        if (aVar.aR()) {
            Bitmap bitmap = this.f68941h;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.f68943j.compareAndSet(false, true)) {
                    String strAT = aVar.aT();
                    if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                        return;
                    }
                    sg.bigo.ads.common.p.e.a(this.f68936c.f67537b.f69380e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.6
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i10, @NonNull String str, String str2) {
                            t.this.f68943j.set(false);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.common.p.f fVar) {
                            t tVar = t.this;
                            tVar.f68941h = bitmap2;
                            tVar.f68942i = sg.bigo.ads.common.w.b.a(bitmap2, 0);
                            t.this.f68943j.set(false);
                        }
                    });
                }
            }
        }
    }
}
