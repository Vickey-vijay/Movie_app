package com.apm.insight.l;

import android.annotation.TargetApi;
import android.os.Debug;
import java.util.Map;

/* JADX INFO: compiled from: DebugMemInfoCompat.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f6574a = new b(0);

    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    @TargetApi(19)
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        public /* synthetic */ b(byte b10) {
            this();
        }

        @Override // com.apm.insight.l.c.a
        public final int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    public static class a {
        private a() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f6574a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f6574a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f6574a.c(memoryInfo);
    }

    /* JADX INFO: renamed from: com.apm.insight.l.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    public static /* synthetic */ class AnonymousClass1 {
        public static Long a(Map<? super String, Long> map, String str, Long l10) {
            if (str == null || map == null) {
                return -1L;
            }
            Long l11 = map.get(str);
            if (l11 != null) {
                l10 = Long.valueOf(l11.longValue() + l10.longValue());
            }
            map.put(str, l10);
            return l10;
        }

        public static Float a(Map<? super String, Float> map) {
            float fFloatValue = 0.0f;
            for (Float f10 : map.values()) {
                if (f10 != null) {
                    fFloatValue += f10.floatValue();
                }
            }
            return Float.valueOf(fFloatValue);
        }

        public static int a(Object obj, int i10) {
            if (obj == null) {
                return i10;
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                try {
                    return Integer.parseInt(String.valueOf(obj));
                } catch (Throwable unused) {
                }
            }
            return i10;
        }
    }
}
