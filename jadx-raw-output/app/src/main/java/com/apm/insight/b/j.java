package com.apm.insight.b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LooperUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MessageQueue f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f6351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f6352c;

    public static MessageQueue a() {
        if (f6350a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f6350a = Looper.myQueue();
            } else {
                f6350a = mainLooper.getQueue();
            }
        }
        return f6350a;
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = f6351b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f6351b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f6351b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Message a(Message message) {
        Field field = f6352c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f6352c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f6352c.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static JSONObject a(Message message, long j10) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j10);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put(TypedValues.AttributesType.S_TARGET, String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put(IconCompat.EXTRA_OBJ, obj);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONArray a(long j10) {
        MessageQueue messageQueueA = a();
        JSONArray jSONArray = new JSONArray();
        if (messageQueueA == null) {
            return jSONArray;
        }
        try {
            synchronized (messageQueueA) {
                Message messageA = a(messageQueueA);
                if (messageA == null) {
                    return jSONArray;
                }
                int i10 = 0;
                int i11 = 0;
                while (messageA != null && i10 < 100) {
                    i10++;
                    i11++;
                    JSONObject jSONObjectA = a(messageA, j10);
                    try {
                        jSONObjectA.put("id", i11);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(jSONObjectA);
                    messageA = a(messageA);
                }
                return jSONArray;
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            return jSONArray;
        }
    }
}
