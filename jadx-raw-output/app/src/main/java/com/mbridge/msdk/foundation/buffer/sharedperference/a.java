package com.mbridge.msdk.foundation.buffer.sharedperference;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: SharedPerferenceManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34521b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f34522c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FastKV f34523a;

    public static synchronized a b() {
        if (f34522c == null) {
            f34522c = new a();
        }
        return f34522c;
    }

    public String a(String str) {
        try {
            if (c.n().d() == null) {
                return null;
            }
            a();
            FastKV fastKV = this.f34523a;
            if (fastKV != null) {
                try {
                    return fastKV.getString(str, "");
                } catch (Exception unused) {
                    return "";
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f34521b, "get error: " + e10.getMessage());
            }
        }
        return null;
    }

    private a() {
    }

    public void c(String str) {
        if (c.n().d() == null) {
            return;
        }
        a();
        FastKV fastKV = this.f34523a;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    public Long b(String str) {
        try {
            if (c.n().d() == null) {
                q0.b(f34521b, "context is null in get");
                return 0L;
            }
            a();
            FastKV fastKV = this.f34523a;
            if (fastKV != null) {
                try {
                    return Long.valueOf(fastKV.getLong(str, 0L));
                } catch (Exception unused) {
                    return 0L;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f34521b, "getLong error: " + e10.getMessage());
            }
        }
        return 0L;
    }

    public int a(String str, int i10) {
        try {
            if (c.n().d() == null) {
                return i10;
            }
            a();
            FastKV fastKV = this.f34523a;
            if (fastKV != null) {
                try {
                    return fastKV.getInt(str, i10);
                } catch (Exception unused) {
                    return i10;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f34521b, "getInt error: " + e10.getMessage());
            }
        }
        return i10;
    }

    public void a(String str, String str2) {
        try {
            if (c.n().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f34523a;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f34521b, "put error: " + e10.getMessage());
            }
        }
    }

    public void b(String str, int i10) {
        try {
            if (c.n().d() == null) {
                return;
            }
            a();
            FastKV fastKV = this.f34523a;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, long j10) {
        try {
            if (c.n().d() == null) {
                q0.b(f34521b, "context is null in put");
                return;
            }
            a();
            FastKV fastKV = this.f34523a;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a(f34521b, "putLong error: " + e10.getMessage());
            }
        }
    }

    private void a() {
        if (this.f34523a == null) {
            try {
                this.f34523a = new FastKV.Builder(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f34523a = null;
            }
        }
    }
}
