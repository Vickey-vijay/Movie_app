package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.e;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes.dex */
public class IconListView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f68696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f68697b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f68698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f68699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f68700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinearLayout f68701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f68702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f68703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LinearLayout f68704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f68705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f68706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final f.a f68707j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f68708k;

        public a(Context context, f.a aVar, String str, boolean z10) {
            this.f68698a = context;
            View viewA = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.f68699b = viewA;
            this.f68700c = z10;
            LinearLayout linearLayout = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_title_layout);
            this.f68701d = linearLayout;
            this.f68702e = (TextView) viewA.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f68703f = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.f68704g = linearLayout2;
            this.f68705h = (TextView) viewA.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.f68706i = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.f68707j = aVar;
            this.f68708k = str;
            a();
        }

        public void a() {
            if (this.f68707j.f68429r == 0) {
                this.f68702e.setVisibility(8);
            } else {
                this.f68702e.setVisibility(0);
                this.f68702e.setText(this.f68707j.f68429r);
                if (this.f68700c) {
                    this.f68702e.setTextColor(-1);
                }
            }
            if (this.f68707j.f68430s == 0) {
                this.f68703f.setVisibility(8);
            } else {
                this.f68703f.setVisibility(0);
                this.f68703f.setImageResource(this.f68707j.f68430s);
            }
            if (this.f68707j.f68431t == 0) {
                this.f68705h.setVisibility(8);
            } else {
                this.f68705h.setVisibility(0);
                this.f68705h.setText(this.f68707j.f68431t);
                if (this.f68700c) {
                    this.f68705h.setTextColor(q.b("#9AFFFFFF", -1));
                }
            }
            if (this.f68707j.f68432u == 0) {
                this.f68706i.setVisibility(8);
            } else {
                this.f68706i.setVisibility(0);
                this.f68706i.setImageResource(this.f68707j.f68432u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f68702e.setVisibility(0);
            this.f68702e.setText(sg.bigo.ads.common.utils.a.a(this.f68698a, this.f68707j.f68429r, e.a(this.f68708k)));
            if (this.f68700c) {
                this.f68702e.setTextColor(-1);
            }
            this.f68703f.setVisibility(8);
            this.f68705h.setVisibility(0);
            this.f68705h.setText(this.f68707j.f68431t);
            if (this.f68700c) {
                this.f68705h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f68706i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f68702e.setVisibility(8);
            this.f68703f.setVisibility(0);
            this.f68703f.setImageResource(this.f68707j.f68430s);
            this.f68705h.setVisibility(0);
            this.f68705h.setText(this.f68707j.f68431t);
            if (this.f68700c) {
                this.f68705h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f68706i.setVisibility(0);
            this.f68706i.setImageResource(this.f68707j.f68432u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f68702e.setVisibility(0);
            this.f68702e.setText(sg.bigo.ads.common.utils.a.a(this.f68698a, this.f68707j.f68429r, e.c(this.f68708k)));
            if (this.f68700c) {
                this.f68702e.setTextColor(-1);
            }
            this.f68703f.setVisibility(0);
            this.f68703f.setImageResource(this.f68707j.f68430s);
            this.f68705h.setVisibility(0);
            this.f68705h.setText(e.b(this.f68708k) + Z7.f27998r + sg.bigo.ads.common.utils.a.a(this.f68698a, this.f68707j.f68431t, new Object[0]));
            if (this.f68700c) {
                this.f68705h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f68706i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68696a = false;
        setOrientation(0);
        setGravity(17);
    }

    private List<a> a(Context context, int i10, String str) {
        d dVar;
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            List<f.a> listA = f.a.a(i10);
            Random random = new Random();
            while (!listA.isEmpty()) {
                arrayList.add(new a(context, listA.remove(random.nextInt(listA.size())), str, this.f68696a));
            }
        } else {
            boolean z10 = this.f68696a;
            if (z10) {
                dVar = new d(context, f.a.f68419i, str, z10);
                arrayList.add(dVar);
                arrayList.add(new b(context, f.a.f68420j, str, this.f68696a));
                cVar = new c(context, f.a.f68421k, str, this.f68696a);
            } else {
                dVar = new d(context, f.a.f68411a, str, z10);
                arrayList.add(dVar);
                arrayList.add(new b(context, f.a.f68412b, str, this.f68696a));
                cVar = new c(context, f.a.f68413c, str, this.f68696a);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0048  */
    /* JADX WARN: Code duplicated, block: B:42:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0065  */
    /* JADX WARN: Code duplicated, block: B:46:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0070  */
    /* JADX WARN: Code duplicated, block: B:49:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0080 A[SYNTHETIC] */
    public final void a(f fVar) {
        List<a> listA;
        int i10;
        int i11;
        removeAllViews();
        if (fVar == null) {
            return;
        }
        Context context = getContext();
        int i12 = fVar.f68407a;
        if (i12 != 1) {
            int i13 = 4;
            if (i12 != 2) {
                if (i12 == 3) {
                    if (fVar.f68410d) {
                        i13 = this.f68696a ? 8 : 2;
                    } else if (!this.f68696a) {
                        i13 = 1;
                    }
                    listA = a(context, i13, fVar.f68409c);
                } else if (i12 != 4 || !fVar.f68410d) {
                    return;
                } else {
                    listA = a(context, this.f68696a ? 8 : 2, fVar.f68409c);
                }
            } else if (!fVar.f68410d) {
                if (!this.f68696a) {
                    i13 = 1;
                }
                listA = a(context, i13, fVar.f68409c);
            }
            this.f68697b = listA;
            if (k.a((Collection) this.f68697b)) {
                return;
            }
            for (i10 = 0; i10 < this.f68697b.size(); i10++) {
                if (i10 > 0) {
                    Context context2 = getContext();
                    if (this.f68696a) {
                        i11 = R.layout.bigo_ad_layout_space;
                    } else {
                        i11 = R.layout.bigo_ad_layout_space_black;
                    }
                    sg.bigo.ads.common.utils.a.a(context2, i11, this, true);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                addView(this.f68697b.get(i10).f68699b, layoutParams);
            }
        }
        if (!fVar.f68410d) {
            return;
        }
        listA = a(context, 0, fVar.f68409c);
        this.f68697b = listA;
        if (k.a((Collection) this.f68697b)) {
            return;
        }
        while (i10 < this.f68697b.size()) {
            if (i10 > 0) {
                Context context3 = getContext();
                if (this.f68696a) {
                    i11 = R.layout.bigo_ad_layout_space;
                } else {
                    i11 = R.layout.bigo_ad_layout_space_black;
                }
                sg.bigo.ads.common.utils.a.a(context3, i11, this, true);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            addView(this.f68697b.get(i10).f68699b, layoutParams2);
        }
    }

    public List<a> getItems() {
        return this.f68697b;
    }

    public void setThemeWhite(boolean z10) {
        this.f68696a = z10;
    }
}
