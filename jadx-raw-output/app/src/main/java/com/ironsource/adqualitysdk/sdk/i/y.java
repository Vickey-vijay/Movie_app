package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<T> extends w<WebView, T> {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private is f3186;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private aa f3187;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<T, aa> f3188 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private y<T>.c f3189 = new c();

    public class c {

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private boolean f3200;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3201;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3202;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3203;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3204;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3205;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3206;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private List<String> f3207;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3208;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public List<String> f3209 = new ArrayList();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3210;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public final y<T>.c m3083(boolean z10) {
            this.f3204 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final y<T>.c m3084(boolean z10) {
            this.f3200 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public final y<T>.c m3085(boolean z10) {
            this.f3202 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final y<T>.c m3086(boolean z10) {
            this.f3203 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final y<T>.c m3087(boolean z10) {
            this.f3205 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m3088(String str) {
            this.f3206 = str;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final y<T>.c m3092(boolean z10) {
            this.f3201 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final y<T>.c m3093(boolean z10) {
            this.f3208 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m3089(List<String> list) {
            this.f3207 = list;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final y<T>.c m3091(List<String> list) {
            if (list != null) {
                this.f3209 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m3090(boolean z10) {
            this.f3210 = z10;
            return this;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract void mo286(T t10, List<WebView> list);

    /* JADX INFO: renamed from: ｋ */
    public abstract r<WebView, T> mo290();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo262(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo267(jSONObject, (WebView) obj, obj2);
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract View mo291(T t10);

    /* JADX INFO: renamed from: ﾒ */
    public abstract aa mo292();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3069(y<T>.c cVar) {
        this.f3189 = cVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3070(final JSONObject jSONObject, final T t10, String str) {
        boolean z10 = ((c) this.f3189).f3208 && !TextUtils.isEmpty(((c) this.f3189).f3206);
        aa aaVarMo292 = ((c) this.f3189).f3204 ? this.f3188.get(t10) : this.f3187;
        if (aaVarMo292 == null) {
            aaVarMo292 = mo292();
            if (((c) this.f3189).f3204) {
                this.f3188.put(t10, aaVarMo292);
            } else {
                this.f3187 = aaVarMo292;
            }
            aaVarMo292.m3051(mo290());
        }
        aaVarMo292.m260();
        aaVarMo292.m261(((c) this.f3189).f3206, ((c) this.f3189).f3207, z10, ((c) this.f3189).f3201, ((c) this.f3189).f3202);
        aaVarMo292.m265(str);
        if (!((c) this.f3189).f3203) {
            super.mo262(jSONObject, null, t10);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo286(t10, arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        is isVar = this.f3186;
        if (isVar != null) {
            arrayList2 = isVar.mo1737(t10);
        }
        final List<WebView> listM2783 = jx.m2783(arrayList, arrayList2);
        if (listM2783.isEmpty() || ((c) this.f3189).f3205) {
            View viewMo291 = mo291(t10);
            if (viewMo291 != null) {
                viewMo291.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3194 = 1;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3197;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f3196 = {17530, 11140, 39882, 2871, 64379, 27486, 55936, 19138, 14897, 43623, 6783, 35223, 31208, 59700, 22884, 51547, 47232, 10436, 38948, 47235, 55161, 26414, 63438, 1920, 38887, 9825, 46643, 50830, 22172, 59050, 30021, 34107, 5590, 42399, 13744, 17506, 54296, 25796, 62608, 1196, 37744, 9021};

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static long f3195 = -5459287922733060147L;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            y.this.mo286(t10, arrayList3);
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            int i18 = f3197 + 23;
                            f3194 = i18 % 128;
                            int i19 = i18 % 2;
                            View viewMo292 = y.this.mo291(t10);
                            if (!(viewMo292 == null)) {
                                int i20 = f3194 + 77;
                                f3197 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    boolean unused = y.this.f3189.f3205;
                                    throw null;
                                }
                                if (!y.this.f3189.f3205) {
                                    viewMo292.removeOnLayoutChangeListener(this);
                                }
                            }
                            y.this.m3067(t10, arrayList3);
                            y.this.mo1703(IronSourceVideoBridge.jsonObjectInit(), arrayList3.get(0), t10);
                        } catch (Throwable th2) {
                            kd.m2872(m3072(19 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 17468)).intern(), m3072((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, TextUtils.lastIndexOf("", '0') + 20, (char) (47302 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), th2, false);
                        }
                    }

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m3072(int i10, int i11, char c10) {
                        String str2;
                        synchronized (d.f1653) {
                            char[] cArr = new char[i10];
                            d.f1652 = 0;
                            while (true) {
                                int i12 = d.f1652;
                                if (i12 < i10) {
                                    cArr[i12] = (char) ((((long) f3196[i11 + i12]) ^ (((long) i12) * f3195)) ^ ((long) c10));
                                    d.f1652 = i12 + 1;
                                } else {
                                    str2 = new String(cArr);
                                }
                            }
                        }
                        return str2;
                    }
                });
            }
            if (listM2783.isEmpty()) {
                super.mo262(jSONObject, null, t10);
                return;
            }
        }
        if (((c) this.f3189).f3200) {
            t.m3001().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.m3067(t10, (List<WebView>) listM2783);
                    y.super.mo262(jSONObject, (WebView) listM2783.get(0), t10);
                }
            });
        } else {
            m3067(t10, listM2783);
            super.mo262(jSONObject, listM2783.get(0), t10);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    public final String mo263(T t10) {
        return (((c) this.f3189).f3204 ? this.f3188.get(t10) : this.f3187).mo263(t10);
    }

    public y(is isVar) {
        this.f3186 = isVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3071(is isVar) {
        this.f3186 = isVar;
    }

    /* JADX INFO: renamed from: ｋ */
    public void mo3029(T t10, String str) {
        m3070(IronSourceVideoBridge.jsonObjectInit(), (Object) t10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public void m3067(T t10, List<WebView> list) {
        aa aaVar;
        aa aaVar2;
        if (((c) this.f3189).f3204) {
            aaVar = this.f3188.get(t10);
        } else {
            aaVar = this.f3187;
        }
        aaVar.m259(list);
        if (((c) this.f3189).f3210) {
            if (((c) this.f3189).f3204) {
                aaVar2 = this.f3188.get(t10);
            } else {
                aaVar2 = this.f3187;
            }
            aaVar2.m265(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public void mo3027(T t10) {
        aa aaVar;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (((c) this.f3189).f3204) {
            aaVar = this.f3188.get(t10);
        } else {
            aaVar = this.f3187;
        }
        mo1706(jSONObjectJsonObjectInit, aaVar.m257(), t10);
    }
}
