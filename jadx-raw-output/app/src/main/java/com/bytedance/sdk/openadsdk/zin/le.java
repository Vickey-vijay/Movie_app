package com.bytedance.sdk.openadsdk.zin;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class le {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private WeakReference<pno> f13604le;
    public Context ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Map<String, ouw> f13606ra = new HashMap();
    public SensorEventListener vt = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.zin.le.1
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            pno pnoVarVt;
            if (sensorEvent.sensor.getType() != 1 || (pnoVarVt = le.this.vt()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, f10);
                jSONObject.put(VastAttributes.VERTICAL_POSITION, f11);
                jSONObject.put("z", f12);
                pnoVarVt.ouw("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public SensorEventListener f13605lh = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.zin.le.12
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            pno pnoVarVt;
            if (sensorEvent.sensor.getType() != 4 || (pnoVarVt = le.this.vt()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, degrees);
                jSONObject.put(VastAttributes.VERTICAL_POSITION, degrees2);
                jSONObject.put("z", degrees3);
                pnoVarVt.ouw("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    public SensorEventListener yu = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.zin.le.23
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            pno pnoVarVt;
            if (sensorEvent.sensor.getType() != 10 || (pnoVarVt = le.this.vt()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, f10);
                jSONObject.put(VastAttributes.VERTICAL_POSITION, f11);
                jSONObject.put("z", f12);
                pnoVarVt.ouw("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    public SensorEventListener fkw = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.zin.le.34
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = bly.vt;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = bly.f13599lh;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = bly.yu;
            SensorManager.getRotationMatrix(fArr5, null, bly.vt, bly.f13599lh);
            float[] fArr6 = bly.fkw;
            SensorManager.getOrientation(fArr5, fArr6);
            pno pnoVarVt = le.this.vt();
            if (pnoVarVt == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                pnoVarVt.ouw("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    public interface ouw {
        JSONObject ouw(JSONObject jSONObject) throws Throwable;
    }

    public final Set<String> ouw() {
        return this.f13606ra.keySet();
    }

    public final JSONObject ouw(String str, JSONObject jSONObject) {
        try {
            ouw ouwVar = this.f13606ra.get(str);
            if (ouwVar != null) {
                return ouwVar.ouw(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", -1);
            return jSONObject2;
        } catch (Throwable th2) {
            ra.ouw("PlayableJsBridge", "invoke error", th2);
            return null;
        }
    }

    public final pno vt() {
        WeakReference<pno> weakReference = this.f13604le;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public le(pno pnoVar) {
        this.ouw = pnoVar.rrs;
        this.f13604le = new WeakReference<>(pnoVar);
        this.f13606ra.put("adInfo", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.45
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                if (pnoVarVt == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = pnoVarVt.f13638kn;
                if (jSONObject3 != null) {
                    jSONObject3.put("code", 1);
                    return jSONObject3;
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("code", -1);
                return jSONObject4;
            }
        });
        this.f13606ra.put("appInfo", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.56
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = le.this.ouw().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                pno pnoVarVt = le.this.vt();
                if (pnoVarVt != null) {
                    jSONObject2.put("deviceId", pnoVarVt.mt);
                    jSONObject2.put("netType", pnoVarVt.ra());
                    jSONObject2.put("innerAppName", pnoVarVt.f13632cj);
                    jSONObject2.put("appName", pnoVarVt.f13654ub);
                    jSONObject2.put("appVersion", pnoVarVt.pv);
                    Map<String, String> map = pnoVarVt.wp;
                    for (String str : map.keySet()) {
                        jSONObject2.put(str, map.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.f13606ra.put("playableSDKInfo", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.62
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(Q6.F, "android");
                return jSONObject2;
            }
        });
        this.f13606ra.put("subscribe_app_ad", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.63
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("download_app_ad", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.64
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put(C3426d4.i.f28556o, new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.2
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                if (pnoVarVt == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", pnoVarVt.zvq);
                return jSONObject3;
            }
        });
        this.f13606ra.put("getVolume", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.3
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                if (pnoVarVt == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", pnoVarVt.xdk);
                return jSONObject3;
            }
        });
        this.f13606ra.put("getScreenSize", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.4
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                View view;
                pno pnoVarVt = le.this.vt();
                if (pnoVarVt == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (pnoVarVt.lso.isNull("width") && (view = pnoVarVt.fqk.get()) != null) {
                    pnoVarVt.ouw(view);
                }
                JSONObject jSONObject3 = pnoVarVt.lso;
                jSONObject3.put("code", 1);
                return jSONObject3;
            }
        });
        this.f13606ra.put("start_accelerometer_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.5
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    try {
                        jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        ra.ouw("PlayableJsBridge", "invoke start_accelerometer_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                le leVar = le.this;
                bly.ouw(leVar.ouw, leVar.vt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("close_accelerometer_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.6
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bly.ouw();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    ra.ouw("PlayableJsBridge", "invoke close_accelerometer_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13606ra.put("start_gyro_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.7
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    try {
                        jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        ra.ouw("PlayableJsBridge", "invoke start_gyro_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                le leVar = le.this;
                bly.vt(leVar.ouw, leVar.f13605lh);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("close_gyro_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.8
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bly.ouw();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    ra.ouw("PlayableJsBridge", "invoke close_gyro_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13606ra.put("start_accelerometer_grativityless_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.9
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    try {
                        jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        ra.ouw("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                le leVar = le.this;
                bly.lh(leVar.ouw, leVar.yu);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("close_accelerometer_grativityless_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.10
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bly.ouw();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    ra.ouw("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13606ra.put("start_rotation_vector_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.11
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    try {
                        jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        ra.ouw("PlayableJsBridge", "invoke start_rotation_vector_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                le leVar = le.this;
                bly.yu(leVar.ouw, leVar.fkw);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("close_rotation_vector_observer", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.13
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bly.ouw();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    ra.ouw("PlayableJsBridge", "invoke close_rotation_vector_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13606ra.put("device_shake", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.14
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bly.ouw(le.this.ouw, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    ra.ouw("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13606ra.put("device_shake_short", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.15
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    bly.ouw(le.this.ouw, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    ra.ouw("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13606ra.put("playable_style", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.16
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = pnoVarVt.yib;
                jSONObject3.put("code", 1);
                return jSONObject3;
            }
        });
        this.f13606ra.put("sendReward", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.17
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                com.bytedance.sdk.openadsdk.zin.ouw ouwVar = pnoVarVt.ux;
                if (ouwVar != null) {
                    ouwVar.vt();
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playableInteractionTriggered", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.18
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                com.bytedance.sdk.openadsdk.zin.ouw ouwVar = pnoVarVt.ux;
                if (ouwVar != null) {
                    ouwVar.lh();
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("webview_time_track", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.19
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.f13606ra.put("playable_event", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.20
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                String strOptString = jSONObject.optString("event", null);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (!TextUtils.isEmpty(strOptString)) {
                    try {
                        int i10 = pnoVarVt.uoy;
                        if (i10 == 0) {
                            if (pnoVarVt.ey != pno.ouw.LAND_PAGE && !pno.ouw(pnoVarVt.ucs)) {
                                pnoVarVt.cf();
                            }
                            jSONObjectOptJSONObject.put("playable_url", pnoVarVt.ucs);
                        } else if (i10 == 3 || i10 == 4) {
                            jSONObjectOptJSONObject.put("playable_url", pnoVarVt.vt(pnoVarVt.f13643ng, pnoVarVt.fwd));
                        } else if (i10 == 1 || i10 == 2) {
                            jSONObjectOptJSONObject.put("playable_url", pnoVarVt.tlj());
                        }
                        jSONObjectOptJSONObject.put("playable_render_type", pnoVarVt.uoy);
                        if (pnoVarVt.ux != null) {
                            if ((pnoVarVt.uoy != 0 || (pnoVarVt.ey == pno.ouw.LAND_PAGE && !pno.ouw(pnoVarVt.ucs))) && pnoVarVt.uoy == 0) {
                                ra.ouw("PlayablePlugin", "reportJSSDKEvent error no not playable url");
                            } else {
                                ra.ouw("PlayablePlugin", "reportJSSDKEvent by ActionProxy");
                                pnoVarVt.ux.ouw(jSONObjectOptJSONObject);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("reportAd", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.21
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("close", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.22
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("openAdLandPageLinks", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.24
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("get_viewport", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.25
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectPno = pnoVarVt.pno();
                jSONObjectPno.put("code", 1);
                return jSONObjectPno;
            }
        });
        this.f13606ra.put("jssdk_load_finish", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.26
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.f13650sd = false;
                pnoVarVt.ouw.removeCallbacks(pnoVarVt.f13641lh);
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (pnoVarVt.zin > 0) {
                        jSONObject3.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - pnoVarVt.zin);
                    } else {
                        jSONObject3.put("playable_jssdk_load_success_duration", 0L);
                    }
                    pnoVarVt.vt("PL_sdk_jssdk_load_success", jSONObject3);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_material_render_result", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.27
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.vt(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("detect_change_playable_click", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.28
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectVt = pnoVarVt.vt();
                jSONObjectVt.put("code", 1);
                return jSONObjectVt;
            }
        });
        this.f13606ra.put("check_camera_permission", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.29
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectYu = pno.yu();
                jSONObjectYu.put("code", 1);
                return jSONObjectYu;
            }
        });
        this.f13606ra.put("check_external_storage", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.30
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectFkw = pno.fkw();
                if (jSONObjectFkw.isNull("result")) {
                    jSONObjectFkw.put("code", -1);
                } else {
                    jSONObjectFkw.put("code", 1);
                }
                return jSONObjectFkw;
            }
        });
        this.f13606ra.put("playable_open_camera", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.31
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_pick_photo", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.32
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_download_media_in_photos", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.33
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (pnoVarVt.ux != null && jSONObject != null) {
                    String strOptString = jSONObject.optString("resource_base64");
                    if (!TextUtils.isEmpty(strOptString)) {
                        int iOptInt = jSONObject.optInt("resource_type", -1);
                        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
                        if (iOptInt == 1) {
                            pnoVarVt.ouw(strOptString2, strOptString);
                        }
                    }
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_preventTouchEvent", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.35
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (pnoVarVt.ux != null) {
                    try {
                        jSONObject.optBoolean("isPrevent", false);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_settings_info", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.36
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectLe = pnoVarVt.le();
                jSONObjectLe.put("code", 1);
                return jSONObjectLe;
            }
        });
        this.f13606ra.put("playable_load_main_scene", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.37
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (pnoVarVt.jqy > 0) {
                        jSONObject3.put("playable_material_interactable_duration", System.currentTimeMillis() - pnoVarVt.jqy);
                    } else {
                        jSONObject3.put("playable_material_interactable_duration", 0L);
                    }
                    if (pnoVarVt.zin > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - pnoVarVt.zin;
                        pnoVarVt.f13652tc = jCurrentTimeMillis;
                        jSONObject3.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
                    } else {
                        jSONObject3.put("playable_material_interactable_load_duration", 0L);
                    }
                    pnoVarVt.vt("PL_sdk_material_interactable", jSONObject3);
                } catch (JSONException unused) {
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_enter_section", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.38
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (jSONObject != null) {
                    pnoVarVt.uq = jSONObject.optString("section");
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_end", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.39
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.f13645od = 2;
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_finish_play_playable", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.40
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.f13646pd = true;
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_transfrom_module_show", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.41
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (pnoVarVt.ux != null) {
                    pno.ouw ouwVar = pno.ouw.LAND_PAGE;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_transfrom_module_change_color", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.42
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (pnoVarVt.ux != null) {
                    pno.ouw ouwVar = pno.ouw.LAND_PAGE;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_set_scroll_rect", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.43
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_click_area", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.44
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                final pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.fak = jSONObject;
                pnoVarVt.f13630cd++;
                pnoVarVt.mwh();
                pnoVarVt.ouw.removeCallbacks(pnoVarVt.yu);
                if (pnoVarVt.f13649rn) {
                    pnoVarVt.ex = System.currentTimeMillis();
                    pnoVarVt.fvf = System.currentTimeMillis();
                    pnoVarVt.bs = 0L;
                    int i10 = pnoVarVt.uoy;
                    if (i10 == 0) {
                        WebView webView = pnoVarVt.jvy;
                        if (webView != null) {
                            webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.zin.pno.10
                                public AnonymousClass10() {
                                }

                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(String str) {
                                    pno.this.bs = System.currentTimeMillis();
                                }
                            });
                        }
                    } else if (i10 == 1 || i10 == 2) {
                        pnoVarVt.ouw("playable_stuck_check_ping", new JSONObject());
                    }
                    pnoVarVt.ouw.postDelayed(pnoVarVt.yu, pnoVarVt.f13653th);
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_real_play_start", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.46
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_material_first_frame_show", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.47
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (pnoVarVt.jqy > 0) {
                        jSONObject3.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - pnoVarVt.jqy);
                    } else {
                        jSONObject3.put("playable_material_first_frame_show_duration", 0L);
                    }
                    if (pnoVarVt.zin > 0) {
                        jSONObject3.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - pnoVarVt.zin);
                    } else {
                        jSONObject3.put("playable_material_first_frame_load_duration", 0L);
                    }
                    pnoVarVt.vt("PL_sdk_material_first_frame_show", jSONObject3);
                } catch (JSONException unused) {
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_stuck_check_pong", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.48
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                vt vtVar;
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.bs = System.currentTimeMillis();
                int i10 = pnoVarVt.uoy;
                if ((i10 == 1 || i10 == 2) && (vtVar = pnoVarVt.f13640le) != null) {
                    vtVar.f13662lh = System.currentTimeMillis();
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_material_adnormal_mask", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.49
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                pnoVarVt.vt(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_long_press_panel", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.50
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_alpha_player_play", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.51
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_transfrom_module_highlight", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.52
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_send_click_event", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.53
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_query_media_permission_declare", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.54
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObjectLh;
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                if (jSONObject == null) {
                    jSONObjectLh = new JSONObject();
                } else {
                    int iOptInt = jSONObject.optInt("type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    if (iOptInt == 1) {
                        jSONObjectLh = pno.lh();
                    } else if (iOptInt != 2) {
                        jSONObjectLh = iOptInt != 3 ? jSONObject3 : pno.fkw();
                    } else {
                        jSONObjectLh = pno.yu();
                    }
                }
                jSONObjectLh.put("code", 1);
                return jSONObjectLh;
            }
        });
        this.f13606ra.put("playable_query_media_permission_enable", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.55
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                pno pnoVarVt = le.this.vt();
                JSONObject jSONObject2 = new JSONObject();
                if (pnoVarVt == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOuw = pnoVarVt.ouw(jSONObject);
                jSONObjectOuw.put("code", 1);
                return jSONObjectOuw;
            }
        });
        this.f13606ra.put("playable_apply_media_permission", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.57
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_start_kws", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.58
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_close_kws", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.59
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_video_preload_task_add", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.60
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f13606ra.put("playable_video_preload_task_cancel", new ouw() { // from class: com.bytedance.sdk.openadsdk.zin.le.61
            @Override // com.bytedance.sdk.openadsdk.zin.le.ouw
            public final JSONObject ouw(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.zin.ouw ouwVarOuw = le.ouw(le.this);
                JSONObject jSONObject2 = new JSONObject();
                if (ouwVarOuw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    public static void lh() {
        bly.ouw();
        bly.ouw();
        bly.ouw();
        bly.ouw();
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.zin.ouw ouw(le leVar) {
        pno pnoVarVt = leVar.vt();
        if (pnoVarVt == null) {
            return null;
        }
        return pnoVarVt.ux;
    }
}
