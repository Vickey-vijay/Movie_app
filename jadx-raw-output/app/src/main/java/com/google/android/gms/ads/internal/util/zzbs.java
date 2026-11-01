package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.android.material.badge.BadgeDrawable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzbs {
    public static JSONObject zzf(@Nullable String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(VastAttributes.HORIZONTAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point2.x));
                    jSONObject3.put(VastAttributes.VERTICAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e10) {
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e10);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e11) {
                e = e11;
                jSONObject = jSONObject2;
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static int[] zzg(@Nullable View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static int zzm(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static boolean zza(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzep)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeq)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0152  */
    public static JSONObject zzb(Context context, @Nullable View view) {
        String str;
        byte b10;
        JSONObject jSONObjectZzl;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                int[] iArrZzg = zzg(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                    iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, view.getMeasuredWidth()));
                jSONObject2.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, view.getMeasuredHeight()));
                jSONObject2.put(VastAttributes.HORIZONTAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg[0]));
                jSONObject2.put(VastAttributes.VERTICAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg[1]));
                jSONObject2.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put(TypedValues.AttributesType.S_FRAME, jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectZzl = zzl(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put(VastAttributes.HORIZONTAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg[0]));
                    jSONObject3.put(VastAttributes.VERTICAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg[1]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectZzl = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectZzl);
            } catch (Exception unused) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get native ad view bounding box");
            }
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    int i11 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (NoSuchMethodException unused2) {
                    str = "";
                } catch (SecurityException e11) {
                    e = e11;
                    int i12 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (InvocationTargetException e12) {
                    e = e12;
                    int i13 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                }
            } else {
                str = "";
            }
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("small_template")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    jSONObject.put("native_template_type", 1);
                } else if (b10 != 1) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (JSONException e13) {
                int i14 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", e13);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjl)).booleanValue()) {
                try {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    jSONObject.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                } catch (Exception unused3) {
                    zze.zza("Unable to get native ad view layout types");
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjn)).booleanValue()) {
                try {
                    jSONObject.put("alpha", view.getAlpha());
                } catch (JSONException e14) {
                    int i15 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log container view alpha signal to JSON", e14);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject zzc(@Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z10 = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjh)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzji)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (zzs.zzC(view) == 0) {
                            z10 = false;
                        }
                        jSONObject.put("contained_in_scroll_view", z10);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjj)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("scroll_view_type", zzs.zzC(view));
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    if ((parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) == -1) {
                        z10 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z10);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, @Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("can_show_on_lock_screen", zzs.zzq(view));
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("is_keyguard_locked", zzs.zzI(context));
            } catch (JSONException unused) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, @Nullable Map map, @Nullable Map map2, @Nullable View view, @Nullable ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrZzg = zzg(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzg2 = zzg(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, view2.getMeasuredHeight()));
                            jSONObject5.put(VastAttributes.HORIZONTAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[0] - iArrZzg[0]));
                            jSONObject5.put(VastAttributes.VERTICAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[1] - iArrZzg[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put(TypedValues.AttributesType.S_FRAME, jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzl(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put(VastAttributes.HORIZONTAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[0] - iArrZzg[0]));
                                jSONObject2.put(VastAttributes.VERTICAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArrZzg2[1] - iArrZzg[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjk)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjl)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjm)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    int i10 = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjn)).booleanValue()) {
                                jSONObject4.put("alpha", view2.getAlpha());
                            }
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((String) entry.getKey(), jSONObject4);
                            } catch (JSONException unused2) {
                                int i11 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                            }
                        } catch (JSONException unused3) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static boolean zzi(Context context, zzfir zzfirVar) {
        if (!zzfirVar.zzN) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjo)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjr)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjp);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzgrr.zza(zzgqq.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public static JSONObject zzj(Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = zzs.zzx((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, displayMetricsZzx.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, displayMetricsZzx.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzk() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjq)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        return layoutParams;
    }

    private static JSONObject zzl(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put(VastAttributes.HORIZONTAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.left));
        jSONObject.put(VastAttributes.VERTICAL_POSITION, com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static Point zzh(MotionEvent motionEvent, @Nullable View view) {
        int[] iArrZzg = zzg(view);
        return new Point(((int) motionEvent.getRawX()) - iArrZzg[0], ((int) motionEvent.getRawY()) - iArrZzg[1]);
    }
}
