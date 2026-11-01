package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataEnergizeWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f38753m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.b f38754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Bitmap> f38755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f38756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38757d = "#FFFFFFFF";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38758e = "#60000000";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38759f = "#FF5F5F5F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f38760g = "#90ECECEC";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f38761h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f38762i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38763j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38764k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f38765l = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class C0405a implements com.mbridge.msdk.video.dynview.util.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f38766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map f38769d;

        public C0405a(TextView textView, String str, CampaignEx campaignEx, Map map) {
            this.f38766a = textView;
            this.f38767b = str;
            this.f38768c = campaignEx;
            this.f38769d = map;
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onFinish() {
            this.f38768c.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f35137c);
            a.this.b(this.f38769d);
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onTick(long j10) {
            a.this.f38764k = (int) (j10 / 1000);
            this.f38766a.setText(com.mbridge.msdk.video.dynview.util.a.a(a.this.f38764k, this.f38766a.getContext()));
            a.this.f38761h++;
            if (TextUtils.isEmpty(this.f38767b) || !this.f38767b.equals("1")) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", "choseFromTwoHeartbeat");
            eVar.a("xtSecond", "countTimeForReport");
            eVar.a("autoPlayCountDownTime", "mLeftOverCountTime");
            com.mbridge.msdk.video.module.report.a.a("2000103", this.f38768c, eVar);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class b implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            if (a.this.f38754a != null) {
                a.this.f38754a.a();
                a.this.f38763j = true;
            }
        }

        public b() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            if (!a.this.f38763j || a.this.f38754a == null) {
                return;
            }
            a.this.f38754a.a(a.this.f38764k * 1000, a.this.f38762i);
            a.this.f38763j = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            if (!a.this.f38763j || a.this.f38754a == null) {
                return;
            }
            a.this.f38754a.a(a.this.f38764k * 1000, a.this.f38762i);
            a.this.f38763j = false;
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class c implements com.mbridge.msdk.video.dynview.inter.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void a() {
            if (!a.this.f38763j || a.this.f38754a == null) {
                return;
            }
            a.this.f38754a.a(a.this.f38764k * 1000, a.this.f38762i);
            a.this.f38763j = false;
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void b() {
            if (a.this.f38754a != null) {
                a.this.f38754a.a();
                a.this.f38763j = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void c() {
            if (a.this.f38754a != null) {
                a.this.f38754a.a();
                a.this.f38763j = true;
            }
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class d extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f38773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f38774c;

        public d(Map map, List list) {
            this.f38773b = map;
            this.f38774c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f38756c) {
                return;
            }
            a.this.f38756c = true;
            a.this.a(this.f38773b, (List<CampaignEx>) this.f38774c, 0);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class e extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f38776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f38777c;

        public e(Map map, List list) {
            this.f38776b = map;
            this.f38777c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f38756c) {
                return;
            }
            a.this.f38756c = true;
            a.this.a(this.f38776b, (List<CampaignEx>) this.f38777c, 1);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class f implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f38779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f38780b;

        public f(Map map, List list) {
            this.f38779a = map;
            this.f38780b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f38779a, (List<CampaignEx>) this.f38780b, i10);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class g implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f38782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f38783b;

        public g(Map map, List list) {
            this.f38782a = map;
            this.f38783b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f38782a, (List<CampaignEx>) this.f38783b, i10);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f38785a;

        public h(Map map) {
            this.f38785a = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(this.f38785a);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class i implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f38788b;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DataEnergizeWrapper.java */
        public class RunnableC0406a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f38790a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: DataEnergizeWrapper.java */
            public class RunnableC0407a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Bitmap f38792a;

                public RunnableC0407a(Bitmap bitmap) {
                    this.f38792a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    i.this.f38788b.setImageBitmap(this.f38792a);
                }
            }

            public RunnableC0406a(Bitmap bitmap) {
                this.f38790a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.f38788b.post(new RunnableC0407a(a0.a(this.f38790a, 10)));
                } catch (Exception e10) {
                    q0.b("DataEnergizeWrapper", e10.getMessage());
                }
            }
        }

        public i(int i10, ImageView imageView) {
            this.f38787a = i10;
            this.f38788b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            try {
                int iA = i0.a(this.f38788b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f38788b.setBackgroundColor(Color.parseColor(a.this.f38759f));
                this.f38788b.setImageResource(iA);
                this.f38788b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e10) {
                q0.a("DataEnergizeWrapper", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iA = i0.a(this.f38788b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f38788b.setBackgroundColor(Color.parseColor(a.this.f38759f));
                this.f38788b.setImageResource(iA);
                this.f38788b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i10 = this.f38787a;
            if (i10 != 501 && i10 != 802) {
                this.f38788b.setImageBitmap(bitmap);
            } else {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0406a(bitmap));
            }
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f38794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.video.dynview.c f38796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f38797d;

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public j(ImageView imageView, String str, com.mbridge.msdk.video.dynview.c cVar, View view) {
            this.f38794a = imageView;
            this.f38795b = str;
            this.f38796c = cVar;
            this.f38797d = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f38794a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (a.this.f38755b != null) {
                a.this.f38755b.put(SameMD5.getMD5(this.f38795b), bitmap);
                a.this.a(this.f38796c, this.f38797d);
            }
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class k extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f38800c;

        public k(CampaignEx campaignEx, Map map) {
            this.f38799b = campaignEx;
            this.f38800c = map;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f38756c) {
                return;
            }
            a.this.f38756c = true;
            this.f38799b.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f35138d);
            a.this.b(this.f38800c);
        }
    }

    public void c(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        try {
            if (this.f38755b == null) {
                this.f38755b = new HashMap();
            }
            List<CampaignEx> listB = cVar.b();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f38753m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listB) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f38753m);
                }
            }
            ListView listView = (ListView) view.findViewById(a(f38753m, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(f38753m, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(f38753m, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.adapter.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.adapter.a(listB);
            if (cVar.h() == 1) {
                if (listView != null) {
                    a(listView, cVar);
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new f(map, listB));
                }
            } else if (gridView != null) {
                int iM = (int) cVar.m();
                int size = iM / listB.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM - (i10 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listB.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new g(map, listB));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new h(map));
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    public void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f38753m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z10 = f38753m;
        LinearLayout linearLayout = z10 ? (LinearLayout) view.findViewById(a(z10, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(f38753m, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(f38753m, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(f38753m, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(f38753m, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(f38753m, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(f38753m, "mbridge_reward_desc_tv"));
        View view2 = (RelativeLayout) view.findViewById(a(f38753m, "mbridge_reward_bottom_layout"));
        List<View> arrayList = new ArrayList<>();
        List<CampaignEx> listB = cVar.b();
        if (listB != null && listB.size() > 0) {
            CampaignEx campaignEx = listB.get(0);
            if (campaignEx != null) {
                if (imageView != null) {
                    if (f38753m) {
                        if (imageView instanceof MBCusRoundImageView) {
                            ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
                        }
                    } else {
                        ((RoundImageView) imageView).setBorderRadius(10);
                    }
                    a(campaignEx.getIconUrl(), imageView);
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    if (f38753m) {
                        if (linearLayout2 instanceof MBStarLevelLayoutView) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout instanceof MBHeatLevelLayoutView) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAdCall());
                }
                int iL = cVar.l();
                if (iL == 102 || iL == 202 || iL == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (iL == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, campaignEx.getImageUrl(), iL);
                } else if (iL != 902) {
                    if (iL != 904) {
                        if (iL == 5002010) {
                            if (cVar.p() && view2 != null && view2.getVisibility() == 0) {
                                arrayList.add(view2);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.p()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.n()) || !cVar.n().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0201  */
    /* JADX WARN: Code duplicated, block: B:54:0x020d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0216  */
    /* JADX WARN: Code duplicated, block: B:58:0x0220  */
    /* JADX WARN: Code duplicated, block: B:59:0x0228  */
    /* JADX WARN: Code duplicated, block: B:61:0x022f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0239  */
    /* JADX WARN: Code duplicated, block: B:65:0x0255  */
    /* JADX WARN: Code duplicated, block: B:67:0x025b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0265  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0302  */
    /* JADX WARN: Code duplicated, block: B:87:0x030b  */
    /* JADX WARN: Code duplicated, block: B:88:0x031d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0333  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        CampaignEx campaignEx;
        CampaignEx campaignEx2;
        RoundImageView roundImageView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        Context context;
        MBRotationView mBRotationView;
        ImageView imageView4;
        MBridgeImageView mBridgeImageView;
        ImageView imageView5;
        ImageView imageView6;
        TextView textView;
        int i10;
        int i11;
        ImageView imageView7;
        TextView textView2;
        ImageView imageView8;
        if (this.f38755b == null) {
            this.f38755b = new HashMap();
        }
        List<CampaignEx> listB = cVar.b();
        if (view == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_ROOTVIEW);
            return;
        }
        Context context2 = view.getContext();
        if (context2 == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (listB == null || listB.size() <= 1) {
            campaignEx = null;
            campaignEx2 = null;
        } else {
            CampaignEx campaignEx3 = listB.get(0);
            campaignEx3.setShowIndex(com.mbridge.msdk.foundation.same.report.metrics.a.f35135a);
            campaignEx = listB.get(1);
            campaignEx.setShowIndex(com.mbridge.msdk.foundation.same.report.metrics.a.f35136b);
            campaignEx2 = campaignEx3;
        }
        if (campaignEx2 == null && eVar != null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (campaignEx == null && eVar != null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f38753m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(f38753m, "mbridge_top_item_rl"));
        MBridgeImageView mBridgeImageView2 = (MBridgeImageView) view.findViewById(a(f38753m, "mbridge_top_iv"));
        MBRotationView mBRotationView2 = (MBRotationView) view.findViewById(a(f38753m, "mbridge_top_ration"));
        TextView textView3 = (TextView) view.findViewById(a(f38753m, "mbridge_top_title_tv"));
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(a(f38753m, "mbridge_bottom_item_rl"));
        MBRotationView mBRotationView3 = (MBRotationView) view.findViewById(a(f38753m, "mbridge_bottom_ration"));
        MBridgeImageView mBridgeImageView3 = (MBridgeImageView) view.findViewById(a(f38753m, "mbridge_bottom_iv"));
        boolean z10 = f38753m;
        if (z10) {
            imageView2 = (MBCusRoundImageView) view.findViewById(a(z10, "mbridge_top_icon_iv"));
            imageView3 = (MBCusRoundImageView) view.findViewById(a(f38753m, "mbridge_bottom_icon_iv"));
            roundImageView = null;
            imageView = null;
        } else {
            roundImageView = (RoundImageView) view.findViewById(a(z10, "mbridge_top_icon_iv"));
            imageView = (RoundImageView) view.findViewById(a(f38753m, "mbridge_bottom_icon_iv"));
            imageView2 = null;
            imageView3 = null;
        }
        ImageView imageView9 = imageView2;
        TextView textView4 = (TextView) view.findViewById(a(f38753m, "mbridge_bottom_title_tv"));
        ImageView imageView10 = (ImageView) view.findViewById(a(f38753m, "mbridge_reward_choice_one_like_iv"));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new d(map, listB));
        }
        if (mBridgeImageView2 != null) {
            imageView5 = imageView;
            context = context2;
            mBRotationView = mBRotationView3;
            imageView4 = imageView10;
            mBridgeImageView = mBridgeImageView3;
            imageView6 = imageView9;
            textView = textView4;
            mBridgeImageView2.setCustomBorder(20, 20, 0, 0, 10, ViewCompat.MEASURED_STATE_MASK);
            a(campaignEx2.getImageUrl(), mBridgeImageView2, cVar, view);
            if (mBRotationView2 != null) {
                if (campaignEx2.getCanStart2C1Anim()) {
                    if (!TextUtils.isEmpty(campaignEx2.getIconUrl())) {
                        ImageView imageView11 = new ImageView(cVar.c());
                        imageView11.setLayoutParams(new FrameLayout.LayoutParams(-1, v0.a(cVar.c(), 200.0f)));
                        imageView11.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        mBRotationView2.addView(imageView11);
                        a(campaignEx2.getIconUrl(), imageView11);
                        mBRotationView2.setWidthRatio(0.45f);
                        mBRotationView2.setHeightRatio(0.9f);
                        mBRotationView2.setAutoscroll(true);
                    } else {
                        mBRotationView2.setWidthRatio(1.0f);
                        mBRotationView2.setHeightRatio(1.0f);
                        i10 = 0;
                        mBRotationView2.setAutoscroll(false);
                    }
                } else {
                    i10 = 0;
                    mBRotationView2.setWidthRatio(1.0f);
                    mBRotationView2.setHeightRatio(1.0f);
                    mBRotationView2.setAutoscroll(false);
                }
            }
            if (roundImageView != null) {
                roundImageView.setType(i10);
                a(campaignEx2.getIconUrl(), roundImageView);
            }
            if (imageView6 != null) {
                a(campaignEx2.getIconUrl(), imageView6);
            }
            if (textView3 != null) {
                if (!TextUtils.isEmpty(campaignEx2.getAppName())) {
                    textView3.setText(campaignEx2.getAppName());
                } else {
                    textView3.setVisibility(8);
                }
            }
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new e(map, listB));
            }
            if (mBridgeImageView != null) {
                mBridgeImageView.setCustomBorder(20, 20, 0, 0, 10, ViewCompat.MEASURED_STATE_MASK);
                a(campaignEx.getImageUrl(), mBridgeImageView, cVar, view);
                if (mBRotationView != null) {
                    if (campaignEx.getCanStart2C1Anim()) {
                        if (!TextUtils.isEmpty(campaignEx.getIconUrl())) {
                            ImageView imageView12 = new ImageView(cVar.c());
                            imageView12.setLayoutParams(new FrameLayout.LayoutParams(-1, v0.a(cVar.c(), 200.0f)));
                            imageView12.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            MBRotationView mBRotationView4 = mBRotationView;
                            mBRotationView4.addView(imageView12);
                            a(campaignEx.getIconUrl(), imageView12);
                            mBRotationView4.setWidthRatio(0.45f);
                            mBRotationView4.setHeightRatio(0.9f);
                            mBRotationView4.setAutoscroll(true);
                            i11 = 0;
                        } else {
                            MBRotationView mBRotationView5 = mBRotationView;
                            mBRotationView5.setWidthRatio(1.0f);
                            mBRotationView5.setHeightRatio(1.0f);
                            i11 = 0;
                            mBRotationView5.setAutoscroll(false);
                        }
                        if (imageView5 != 0) {
                            imageView5.setType(i11);
                            a(campaignEx.getIconUrl(), imageView5);
                        }
                        imageView7 = imageView3;
                        if (imageView7 != null) {
                            a(campaignEx.getIconUrl(), imageView7);
                        }
                        textView2 = textView;
                        if (textView2 != null) {
                            textView2.setText(campaignEx.getAppName());
                        }
                        a(campaignEx2.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx2);
                        imageView8 = imageView4;
                        if (imageView8 != null) {
                            if (cVar.h() == 1) {
                                Context context3 = context;
                                imageView8.setImageResource(i0.a(context3.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context3, 1), "drawable"));
                            } else {
                                Context context4 = context;
                                imageView8.setImageResource(i0.a(context4.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context4, 2), "drawable"));
                            }
                        }
                        if (eVar != null) {
                            eVar.a(view, null);
                        }
                    }
                    MBRotationView mBRotationView6 = mBRotationView;
                    i11 = 0;
                    mBRotationView6.setWidthRatio(1.0f);
                    mBRotationView6.setHeightRatio(1.0f);
                    mBRotationView6.setAutoscroll(false);
                }
                if (imageView5 != 0) {
                    imageView5.setType(i11);
                    a(campaignEx.getIconUrl(), imageView5);
                }
                imageView7 = imageView3;
                if (imageView7 != null) {
                    a(campaignEx.getIconUrl(), imageView7);
                }
                textView2 = textView;
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAppName());
                }
                a(campaignEx2.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx2);
                imageView8 = imageView4;
                if (imageView8 != null) {
                    if (cVar.h() == 1) {
                        Context context5 = context;
                        imageView8.setImageResource(i0.a(context5.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context5, 1), "drawable"));
                    } else {
                        Context context6 = context;
                        imageView8.setImageResource(i0.a(context6.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context6, 2), "drawable"));
                    }
                }
                if (eVar != null) {
                    eVar.a(view, null);
                }
            }
            i11 = 0;
            if (imageView5 != 0) {
                imageView5.setType(i11);
                a(campaignEx.getIconUrl(), imageView5);
            }
            imageView7 = imageView3;
            if (imageView7 != null) {
                a(campaignEx.getIconUrl(), imageView7);
            }
            textView2 = textView;
            if (textView2 != null) {
                textView2.setText(campaignEx.getAppName());
            }
            a(campaignEx2.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx2);
            imageView8 = imageView4;
            if (imageView8 != null) {
                if (cVar.h() == 1) {
                    Context context7 = context;
                    imageView8.setImageResource(i0.a(context7.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context7, 1), "drawable"));
                } else {
                    Context context8 = context;
                    imageView8.setImageResource(i0.a(context8.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context8, 2), "drawable"));
                }
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        }
        context = context2;
        mBRotationView = mBRotationView3;
        imageView4 = imageView10;
        mBridgeImageView = mBridgeImageView3;
        imageView5 = imageView;
        imageView6 = imageView9;
        textView = textView4;
        i10 = 0;
        if (roundImageView != null) {
            roundImageView.setType(i10);
            a(campaignEx2.getIconUrl(), roundImageView);
        }
        if (imageView6 != null) {
            a(campaignEx2.getIconUrl(), imageView6);
        }
        if (textView3 != null) {
            if (!TextUtils.isEmpty(campaignEx2.getAppName())) {
                textView3.setText(campaignEx2.getAppName());
            } else {
                textView3.setVisibility(8);
            }
        }
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new e(map, listB));
        }
        if (mBridgeImageView != null) {
            mBridgeImageView.setCustomBorder(20, 20, 0, 0, 10, ViewCompat.MEASURED_STATE_MASK);
            a(campaignEx.getImageUrl(), mBridgeImageView, cVar, view);
            if (mBRotationView != null) {
                if (campaignEx.getCanStart2C1Anim()) {
                    if (!TextUtils.isEmpty(campaignEx.getIconUrl())) {
                        ImageView imageView13 = new ImageView(cVar.c());
                        imageView13.setLayoutParams(new FrameLayout.LayoutParams(-1, v0.a(cVar.c(), 200.0f)));
                        imageView13.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        MBRotationView mBRotationView7 = mBRotationView;
                        mBRotationView7.addView(imageView13);
                        a(campaignEx.getIconUrl(), imageView13);
                        mBRotationView7.setWidthRatio(0.45f);
                        mBRotationView7.setHeightRatio(0.9f);
                        mBRotationView7.setAutoscroll(true);
                        i11 = 0;
                    } else {
                        MBRotationView mBRotationView8 = mBRotationView;
                        mBRotationView8.setWidthRatio(1.0f);
                        mBRotationView8.setHeightRatio(1.0f);
                        i11 = 0;
                        mBRotationView8.setAutoscroll(false);
                    }
                    if (imageView5 != 0) {
                        imageView5.setType(i11);
                        a(campaignEx.getIconUrl(), imageView5);
                    }
                    imageView7 = imageView3;
                    if (imageView7 != null) {
                        a(campaignEx.getIconUrl(), imageView7);
                    }
                    textView2 = textView;
                    if (textView2 != null) {
                        textView2.setText(campaignEx.getAppName());
                    }
                    a(campaignEx2.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx2);
                    imageView8 = imageView4;
                    if (imageView8 != null) {
                        if (cVar.h() == 1) {
                            Context context9 = context;
                            imageView8.setImageResource(i0.a(context9.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context9, 1), "drawable"));
                        } else {
                            Context context10 = context;
                            imageView8.setImageResource(i0.a(context10.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context10, 2), "drawable"));
                        }
                    }
                    if (eVar != null) {
                        eVar.a(view, null);
                    }
                }
                MBRotationView mBRotationView9 = mBRotationView;
                i11 = 0;
                mBRotationView9.setWidthRatio(1.0f);
                mBRotationView9.setHeightRatio(1.0f);
                mBRotationView9.setAutoscroll(false);
            }
            if (imageView5 != 0) {
                imageView5.setType(i11);
                a(campaignEx.getIconUrl(), imageView5);
            }
            imageView7 = imageView3;
            if (imageView7 != null) {
                a(campaignEx.getIconUrl(), imageView7);
            }
            textView2 = textView;
            if (textView2 != null) {
                textView2.setText(campaignEx.getAppName());
            }
            a(campaignEx2.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx2);
            imageView8 = imageView4;
            if (imageView8 != null) {
                if (cVar.h() == 1) {
                    Context context11 = context;
                    imageView8.setImageResource(i0.a(context11.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context11, 1), "drawable"));
                } else {
                    Context context12 = context;
                    imageView8.setImageResource(i0.a(context12.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context12, 2), "drawable"));
                }
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        }
        i11 = 0;
        if (imageView5 != 0) {
            imageView5.setType(i11);
            a(campaignEx.getIconUrl(), imageView5);
        }
        imageView7 = imageView3;
        if (imageView7 != null) {
            a(campaignEx.getIconUrl(), imageView7);
        }
        textView2 = textView;
        if (textView2 != null) {
            textView2.setText(campaignEx.getAppName());
        }
        a(campaignEx2.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx2);
        imageView8 = imageView4;
        if (imageView8 != null) {
            if (cVar.h() == 1) {
                Context context13 = context;
                imageView8.setImageResource(i0.a(context13.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context13, 1), "drawable"));
            } else {
                Context context14 = context;
                imageView8.setImageResource(i0.a(context14.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context14, 2), "drawable"));
            }
        }
        if (eVar != null) {
            eVar.a(view, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
                    ((com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback")).a();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.video.dynview.shape.a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
        bVarA.orientation(cVar.h()).a(true);
        if (cVar.h() != 2 || cVar.m() > cVar.k()) {
            bVarA.b(cVar.m()).a(cVar.k());
        } else {
            bVarA.b(cVar.k()).a(cVar.m());
        }
        if (view.getBackground() == null) {
            view.setBackground(bVarA.build());
        }
    }

    private void b() {
        com.mbridge.msdk.video.dynview.util.draw.a.a().b();
        com.mbridge.msdk.video.dynview.util.time.b bVar = this.f38754a;
        if (bVar != null) {
            bVar.a();
            this.f38754a = null;
        }
        com.mbridge.msdk.video.dynview.energize.a.a().f38615a = null;
        if (this.f38765l != null) {
            this.f38765l = null;
        }
        Map<String, Bitmap> map = this.f38755b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f38755b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f38755b.clear();
        }
    }

    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f38760g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f38760g));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e10) {
            q0.a("DataEnergizeWrapper", e10.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i10) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new i(i10, imageView));
    }

    private void a(String str, ImageView imageView, com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new j(imageView, str, cVar, view));
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    private void a(String str, Context context, View view, int i10, Map map, CampaignEx campaignEx) {
        String strA = c1.a(str, "cltp");
        String strA2 = c1.a(str, "xt");
        long j10 = !TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L;
        if (j10 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f38753m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            TextView textView = (TextView) view.findViewById(a(f38753m, "mbridge_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f38757d));
                String str2 = this.f38758e;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView, 1, 12, str2, str2);
                textView.setVisibility(0);
                textView.setOnClickListener(new k(campaignEx, map));
                this.f38762i = new C0405a(textView, strA2, campaignEx, map);
                com.mbridge.msdk.video.dynview.util.time.b bVarA = new com.mbridge.msdk.video.dynview.util.time.b().b(j10 * 1000).a(1000L).a(this.f38762i);
                this.f38754a = bVarA;
                bVarA.c();
            }
            ImageView imageView = (ImageView) view.findViewById(a(f38753m, "mbridge_iv_link"));
            if (campaignEx == null) {
                return;
            }
            if (campaignEx.getAdchoice() != null) {
                campaignEx.getAdchoice().g("");
            }
            v0.a(4, imageView, campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), false, new b());
        }
    }

    private void a(ListView listView, com.mbridge.msdk.video.dynview.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fK = (cVar.k() - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 720.0f)) / 2.0f;
            int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
            int i10 = (int) fK;
            layoutParams.setMargins(iA, i10, iA, i10);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, List<CampaignEx> list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
            com.mbridge.msdk.video.dynview.listener.d dVar = (com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback");
            if (dVar != null) {
                dVar.a(list.get(i10));
                try {
                    CampaignEx campaignEx = list.get(i10);
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("click", "0");
                    eVar.a("time", Long.valueOf(this.f38761h));
                    eVar.a("choose_cid", campaignEx.getId());
                    eVar.a(C3426d4.i.L, Integer.valueOf(i10));
                    eVar.a("type", "choseFromTwoSelect");
                    com.mbridge.msdk.video.module.report.a.a("2000103", campaignEx, eVar);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
            b();
            return;
        }
        if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
            com.mbridge.msdk.video.dynview.listener.c cVar = (com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback");
            if (cVar != null) {
                cVar.a(list.get(i10), i10);
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
                    ((com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback")).close();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f38755b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(this.f38755b, cVar, view);
    }

    private int a(boolean z10, String str) {
        try {
            if (z10) {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                return str.hashCode();
            }
            return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f38760g));
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return bitmapCreateBitmap;
            }
            e10.printStackTrace();
            return bitmapCreateBitmap;
        }
    }
}
