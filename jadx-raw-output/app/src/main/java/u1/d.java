package u1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import ck.w;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ViewHierarchy.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010 \u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\nH\u0002J\u0016\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%2\u0006\u0010$\u001a\u00020\u0011H\u0002R\u001c\u0010)\u001a\n '*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00062"}, d2 = {"Lu1/d;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/ViewGroup;", "j", "", "b", "Lorg/json/JSONObject;", "json", "Lmj/r;", "s", "d", "", "c", "", "o", "", CampaignEx.JSON_KEY_AD_K, "i", "Landroid/view/View$OnClickListener;", "g", "newListener", "r", "Landroid/view/View$OnTouchListener;", "h", "a", "RCTRootView", "p", "e", "", "location", "l", "q", InneractiveMediationDefs.GENDER_MALE, "n", "className", "Ljava/lang/Class;", InneractiveMediationDefs.GENDER_FEMALE, "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "RCTRootViewReference", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "methodFindTouchTargetView", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f72518a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = d.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static WeakReference<View> RCTRootViewReference = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static Method methodFindTouchTargetView;

    public static final View a(View view) {
        if (i2.a.d(d.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f72518a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                i2.a.b(th2, d.class);
            }
        }
        return null;
    }

    public static final List<View> b(View view) {
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                int i10 = 0;
                if (childCount > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        arrayList.add(((ViewGroup) view).getChildAt(i10));
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (i2.a.d(d.class)) {
            return 0;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (o(view)) {
                i10 |= 512;
            }
            if (view instanceof TextView) {
                int i11 = i10 | 1024 | 1;
                if (view instanceof Button) {
                    i11 |= 4;
                    if (view instanceof Switch) {
                        i11 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i11 |= 32768;
                    }
                }
                return view instanceof EditText ? i11 | 2048 : i11;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return i10 | 65536;
                }
                if (view instanceof RadioGroup) {
                    return i10 | 16384;
                }
                return ((view instanceof ViewGroup) && f72518a.p(view, RCTRootViewReference.get())) ? i10 | 64 : i10;
            }
            return i10 | 4096;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (p.e(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                RCTRootViewReference = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> listB = b(view);
                int i10 = 0;
                int size = listB.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(d(listB.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        Field declaredField;
        try {
            if (i2.a.d(d.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (IllegalAccessException e10) {
                    j0 j0Var = j0.f14425a;
                    j0.d0(TAG, e10);
                    return null;
                }
            } catch (ClassNotFoundException e11) {
                j0 j0Var2 = j0.f14425a;
                j0.d0(TAG, e11);
                return null;
            } catch (NoSuchFieldException e12) {
                j0 j0Var3 = j0.f14425a;
                j0.d0(TAG, e12);
                return null;
            }
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence hint;
        String string;
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (i2.a.d(d.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010a A[EDGE_INSN: B:44:0x010a->B:45:0x010b BREAK  A[LOOP:0: B:32:0x00dc->B:39:0x00f9]] */
    public static final String k(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    int i10 = 0;
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                if (childCount <= 0) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                while (true) {
                                    int i11 = i10 + 1;
                                    View childAt = ((RadioGroup) view).getChildAt(i10);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    if (i11 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            p.i(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            p.i(currentMinute, "view.currentMinute");
                            int iIntValue2 = currentMinute.intValue();
                            w wVar = w.f6066a;
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                            p.i(charSequenceValueOf, "java.lang.String.format(format, *args)");
                        }
                    } else {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        w wVar2 = w.f6066a;
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                        p.i(charSequenceValueOf, "java.lang.String.format(format, *args)");
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public static final boolean o(View view) {
        if (i2.a.d(d.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            d dVar = f72518a;
            Class<?> clsF = dVar.f("android.support.v4.view.NestedScrollingChild");
            if (clsF != null && clsF.isInstance(parent)) {
                return true;
            }
            Class<?> clsF2 = dVar.f("androidx.core.view.NestedScrollingChild");
            return clsF2 != null && clsF2.isInstance(parent);
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (i2.a.d(d.class)) {
            return;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                declaredField2.set(obj, onClickListener);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
        }
    }

    public static final void s(View view, JSONObject jSONObject) {
        if (i2.a.d(d.class)) {
            return;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.j(jSONObject, "json");
            try {
                String strK = k(view);
                String strI = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (b.g(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", j0.k(j0.A0(strK), ""));
                }
                jSONObject.put("hint", j0.k(j0.A0(strI), ""));
                if (tag != null) {
                    jSONObject.put("tag", j0.k(j0.A0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, j0.k(j0.A0(contentDescription.toString()), ""));
                }
                jSONObject.put(TypedValues.Custom.S_DIMENSION, f72518a.e(view));
            } catch (JSONException e10) {
                j0 j0Var = j0.f14425a;
                j0.d0(TAG, e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
        }
    }

    public final JSONObject e(View view) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final Class<?> f(String className) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final View l(float[] location, View RCTRootView) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = methodFindTouchTargetView;
            if (method != null && RCTRootView != null) {
                try {
                    if (method != null) {
                        Object objInvoke = method.invoke(null, location, RCTRootView);
                        if (objInvoke != null) {
                            View view = (View) objInvoke;
                            if (view.getId() > 0) {
                                Object parent = view.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalAccessException e10) {
                    j0 j0Var = j0.f14425a;
                    j0.d0(TAG, e10);
                } catch (InvocationTargetException e11) {
                    j0 j0Var2 = j0.f14425a;
                    j0.d0(TAG, e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final float[] m(View view) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void n() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (methodFindTouchTargetView != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                methodFindTouchTargetView = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException e10) {
                j0 j0Var = j0.f14425a;
                j0.d0(TAG, e10);
            } catch (NoSuchMethodException e11) {
                j0 j0Var2 = j0.f14425a;
                j0.d0(TAG, e11);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final boolean p(View view, View RCTRootView) {
        View viewL;
        if (i2.a.d(this)) {
            return false;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (!p.e(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (viewL = l(m(view), RCTRootView)) == null || viewL.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final boolean q(View view) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            return p.e(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }
}
