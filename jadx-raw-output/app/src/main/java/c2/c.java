package c2;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import ck.p;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nj.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SuggestedEventViewHierarchy.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0015"}, d2 = {"Lc2/c;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "clickedView", "Lorg/json/JSONObject;", "b", "json", "Lmj/r;", "e", "", "a", "hostView", "", "d", "c", "Ljava/lang/Class;", "Ljava/util/List;", "blacklistedViews", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5611a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final List<Class<? extends View>> blacklistedViews = s.n(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final List<View> a(View view) {
        if (i2.a.d(c.class)) {
            return null;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = blacklistedViews.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = u1.d.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (i2.a.d(c.class)) {
            return null;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.j(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = u1.d.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            i2.a.b(th2, c.class);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (i2.a.d(c.class)) {
            return null;
        }
        try {
            p.j(hostView, "hostView");
            String strK = u1.d.k(hostView);
            if (strK.length() > 0) {
                return strK;
            }
            String strJoin = TextUtils.join(Z7.f27998r, f5611a.c(hostView));
            p.i(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            i2.a.b(th2, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (i2.a.d(c.class)) {
            return;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.j(jSONObject, "json");
            try {
                String strK = u1.d.k(view);
                String strI = u1.d.i(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", u1.d.c(view));
                boolean z10 = true;
                if (strK.length() > 0) {
                    jSONObject.put("text", strK);
                }
                if (strI.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    jSONObject.put("hint", strI);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, c.class);
        }
    }

    public final List<String> c(View view) {
        boolean z10;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : u1.d.b(view)) {
                String strK = u1.d.k(view2);
                if (strK.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(strK);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
