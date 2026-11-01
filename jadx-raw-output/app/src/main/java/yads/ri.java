package yads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3426d4;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y12 f82281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qi f82282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f82283c;

    public ri(y12 y12Var, qi qiVar, List list) {
        this.f82281a = y12Var;
        this.f82282b = qiVar;
        this.f82283c = list;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ad  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final HashMap a() {
        Object lb0Var;
        TextView textView;
        HashMap map = new HashMap();
        qi qiVar = this.f82282b;
        View viewA = this.f82281a.a("close_button");
        TextView textView2 = viewA instanceof TextView ? (TextView) viewA : null;
        qiVar.getClass();
        iw iwVar = textView2 != null ? new iw(textView2) : null;
        map.put("close_button", iwVar != null ? new lb0(iwVar) : null);
        qi qiVar2 = this.f82282b;
        View viewA2 = this.f82281a.a("feedback");
        ImageView imageView = viewA2 instanceof ImageView ? (ImageView) viewA2 : null;
        qiVar2.getClass();
        tu0 tu0Var = imageView != null ? new tu0(imageView, new w31(imageView.getContext(), new s32(qiVar2.f81854a), qiVar2.f81855b)) : null;
        map.put("feedback", tu0Var != null ? new h31(tu0Var) : null);
        qi qiVar3 = this.f82282b;
        lm2 lm2Var = this.f82281a.f84792b;
        jk.k[] kVarArr = y12.f84790g;
        jk.k kVar = kVarArr[1];
        ImageView imageView2 = (ImageView) lm2Var.f79854a.get();
        View viewA3 = this.f82281a.a(C3426d4.i.I0);
        map.put(C3426d4.i.I0, qiVar3.a(imageView2, viewA3 instanceof CustomizableMediaView ? (CustomizableMediaView) viewA3 : null));
        qi qiVar4 = this.f82282b;
        View viewA4 = this.f82281a.a("rating");
        qiVar4.getClass();
        rl2 rl2Var = viewA4 instanceof tl2 ? new rl2(viewA4, qiVar4.f81859f) : null;
        map.put("rating", rl2Var != null ? new lb0(rl2Var) : null);
        qi qiVar5 = this.f82282b;
        View viewA5 = this.f82281a.a();
        qiVar5.getClass();
        xr2 xr2Var = viewA5 != null ? new xr2(viewA5) : null;
        map.put("root_container", xr2Var != null ? new lb0(xr2Var) : null);
        lm2 lm2Var2 = this.f82281a.f84795e;
        jk.k kVar2 = kVarArr[4];
        List list = (List) lm2Var2.f79854a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        for (oi oiVar : this.f82283c) {
            View viewA6 = this.f82281a.a(oiVar.f81048a);
            if (viewA6 != null && !map.containsKey(oiVar.f81048a)) {
                qi qiVar6 = this.f82282b;
                String str = oiVar.f81049b;
                qiVar6.getClass();
                switch (str.hashCode()) {
                    case -1034364087:
                        if (str.equals("number")) {
                            if (viewA6 instanceof TextView) {
                                textView = (TextView) viewA6;
                            } else {
                                textView = null;
                            }
                            if (textView != null) {
                                lb0Var = new lb0(new b63((TextView) viewA6));
                            } else {
                                lb0Var = null;
                            }
                        } else {
                            lb0Var = null;
                        }
                        break;
                    case -891985903:
                        if (str.equals(TypedValues.Custom.S_STRING)) {
                            if (viewA6 instanceof TextView) {
                                textView = (TextView) viewA6;
                            } else {
                                textView = null;
                            }
                            if (textView != null) {
                                lb0Var = new lb0(new b63((TextView) viewA6));
                            } else {
                                lb0Var = null;
                            }
                        } else {
                            lb0Var = null;
                        }
                        break;
                    case -410956671:
                        lb0Var = str.equals("container") ? new lb0(new xr2(viewA6)) : null;
                        break;
                    case 100313435:
                        if (str.equals("image")) {
                            lb0Var = (viewA6 instanceof ImageView ? (ImageView) viewA6 : null) != null ? new h31(new c51((ImageView) viewA6, qiVar6.f81855b, qiVar6.f81854a)) : null;
                        } else {
                            lb0Var = null;
                        }
                        break;
                    case 103772132:
                        if (str.equals(C3426d4.i.I0)) {
                            lb0Var = (viewA6 instanceof CustomizableMediaView ? (CustomizableMediaView) viewA6 : null) != null ? qiVar6.a(null, (CustomizableMediaView) viewA6) : null;
                        } else {
                            lb0Var = null;
                        }
                        break;
                    default:
                        lb0Var = null;
                        break;
                }
                if (lb0Var == null) {
                    this.f82282b.getClass();
                    lb0Var = new lb0(new of0(viewA6));
                }
                map.put(oiVar.f81048a, lb0Var);
            }
        }
        for (Map.Entry entry : this.f82281a.f84796f.entrySet()) {
            String str2 = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !map.containsKey(str2)) {
                this.f82282b.getClass();
                map.put(str2, new lb0(new of0(view)));
            }
        }
        return map;
    }

    public ri(y12 y12Var, mi2 mi2Var, tn1 tn1Var, d42 d42Var, h32 h32Var, v9 v9Var, l72 l72Var, at1 at1Var, t20 t20Var) {
        this(y12Var, new qi(v9Var, mi2Var, tn1Var, d42Var, h32Var, at1Var, t20Var), l72Var.b());
    }
}
