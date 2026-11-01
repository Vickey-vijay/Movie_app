package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.inmobi.media.Tg;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23564a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f23565b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f23566c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f23567d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f23568e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f23569f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f23570g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f23571h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23572i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f23573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f23574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f23575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f23576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Location f23577n;

    public static void a(final boolean z10) {
        f23565b = Boolean.valueOf(z10);
        final Context context = Ji.f22951a;
        if (context != null) {
            Runnable runnable = new Runnable() { // from class: b7.i4
                @Override // java.lang.Runnable
                public final void run() {
                    Tg.a(context, z10);
                }
            };
            ck.p.j(runnable, "runnable");
            Ji.f22957g.submit(runnable);
        }
    }

    public static Location b() {
        Location location = f23577n;
        if (location != null) {
            return location;
        }
        Context context = Ji.f22951a;
        Location location2 = null;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "user_info_store");
        ck.p.j("user_location", C3426d4.i.W);
        String string = eaA.f22577a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(StringUtils.COMMA).split(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f23577n = location2;
        return location2;
    }

    public static final void a(Context context, boolean z10) {
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea.a(Da.a(context, "user_info_store"), "user_age_restricted", z10);
    }

    public static HashMap a() {
        HashMap map = new HashMap();
        int i10 = f23564a;
        int i11 = Integer.MIN_VALUE;
        if (i10 == Integer.MIN_VALUE) {
            Context context = Ji.f22951a;
            if (context == null) {
                i10 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "user_info_store");
                ck.p.j("user_age", C3426d4.i.W);
                i10 = eaA.f22577a.getInt("user_age", Integer.MIN_VALUE);
            }
            f23564a = i10;
        }
        if (i10 > 0) {
            map.put("u-age", String.valueOf(i10));
        }
        int i12 = f23572i;
        if (i12 == Integer.MIN_VALUE) {
            Context context2 = Ji.f22951a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
                Ea eaA2 = Da.a(context2, "user_info_store");
                ck.p.j("user_yob", C3426d4.i.W);
                i11 = eaA2.f22577a.getInt("user_yob", Integer.MIN_VALUE);
            }
            f23572i = i11;
            i12 = i11;
        }
        if (i12 > 0) {
            map.put("u-yearofbirth", String.valueOf(i12));
        }
        String string = f23569f;
        String string2 = null;
        if (string == null) {
            Context context3 = Ji.f22951a;
            if (context3 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = Ea.f22576b;
                Ea eaA3 = Da.a(context3, "user_info_store");
                ck.p.j("user_city_code", C3426d4.i.W);
                string = eaA3.f22577a.getString("user_city_code", null);
            }
            f23569f = string;
        }
        String string3 = f23570g;
        if (string3 == null) {
            Context context4 = Ji.f22951a;
            if (context4 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = Ea.f22576b;
                Ea eaA4 = Da.a(context4, "user_info_store");
                ck.p.j("user_state_code", C3426d4.i.W);
                string3 = eaA4.f22577a.getString("user_state_code", null);
            }
            f23570g = string3;
        }
        String string4 = f23571h;
        if (string4 == null) {
            Context context5 = Ji.f22951a;
            if (context5 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = Ea.f22576b;
                Ea eaA5 = Da.a(context5, "user_info_store");
                ck.p.j("user_country_code", C3426d4.i.W);
                string4 = eaA5.f22577a.getString("user_country_code", null);
            }
            f23571h = string4;
        }
        String strA = a(string, string3, string4);
        int length = strA.length() - 1;
        boolean zBooleanValue = false;
        int i13 = 0;
        boolean z10 = false;
        while (i13 <= length) {
            boolean z11 = ck.p.l(strA.charAt(!z10 ? i13 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i13++;
            } else {
                z10 = true;
            }
        }
        if (strA.subSequence(i13, length + 1).toString().length() > 0) {
            map.put("u-location", strA);
        }
        String string5 = f23566c;
        if (string5 == null) {
            Context context6 = Ji.f22951a;
            if (context6 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = Ea.f22576b;
                Ea eaA6 = Da.a(context6, "user_info_store");
                ck.p.j("user_age_group", C3426d4.i.W);
                string5 = eaA6.f22577a.getString("user_age_group", null);
            }
            f23566c = string5;
        }
        if (string5 != null) {
            Locale locale = Locale.ENGLISH;
            ck.p.i(locale, "ENGLISH");
            String lowerCase = string5.toLowerCase(locale);
            ck.p.i(lowerCase, "toLowerCase(...)");
            map.put("u-agegroup", lowerCase);
        }
        String string6 = f23567d;
        if (string6 == null) {
            Context context7 = Ji.f22951a;
            if (context7 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = Ea.f22576b;
                Ea eaA7 = Da.a(context7, "user_info_store");
                ck.p.j("user_area_code", C3426d4.i.W);
                string6 = eaA7.f22577a.getString("user_area_code", null);
            }
            f23567d = string6;
        }
        if (string6 != null) {
            map.put("u-areacode", string6);
        }
        String string7 = f23568e;
        if (string7 == null) {
            Context context8 = Ji.f22951a;
            if (context8 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = Ea.f22576b;
                Ea eaA8 = Da.a(context8, "user_info_store");
                ck.p.j("user_post_code", C3426d4.i.W);
                string7 = eaA8.f22577a.getString("user_post_code", null);
            }
            f23568e = string7;
        }
        if (string7 != null) {
            map.put("u-postalcode", string7);
        }
        String string8 = f23573j;
        if (string8 == null) {
            Context context9 = Ji.f22951a;
            if (context9 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = Ea.f22576b;
                Ea eaA9 = Da.a(context9, "user_info_store");
                ck.p.j("user_gender", C3426d4.i.W);
                string8 = eaA9.f22577a.getString("user_gender", null);
            }
            f23573j = string8;
        }
        if (string8 != null) {
            map.put("u-gender", string8);
        }
        String string9 = f23574k;
        if (string9 == null) {
            Context context10 = Ji.f22951a;
            if (context10 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = Ea.f22576b;
                Ea eaA10 = Da.a(context10, "user_info_store");
                ck.p.j("user_education", C3426d4.i.W);
                string9 = eaA10.f22577a.getString("user_education", null);
            }
            f23574k = string9;
        }
        if (string9 != null) {
            map.put("u-education", string9);
        }
        String string10 = f23575l;
        if (string10 == null) {
            Context context11 = Ji.f22951a;
            if (context11 == null) {
                string10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = Ea.f22576b;
                Ea eaA11 = Da.a(context11, "user_info_store");
                ck.p.j("user_language", C3426d4.i.W);
                string10 = eaA11.f22577a.getString("user_language", null);
            }
            f23575l = string10;
        }
        if (string10 != null) {
            map.put("u-language", string10);
        }
        String str = f23576m;
        if (str == null) {
            Context context12 = Ji.f22951a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = Ea.f22576b;
                Ea eaA12 = Da.a(context12, "user_info_store");
                ck.p.j("user_interest", C3426d4.i.W);
                string2 = eaA12.f22577a.getString("user_interest", null);
            }
            f23576m = string2;
            str = string2;
        }
        if (str != null) {
            map.put("u-interests", str);
        }
        Boolean bool = f23565b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context13 = Ji.f22951a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = Ea.f22576b;
                Ea eaA13 = Da.a(context13, "user_info_store");
                ck.p.j("user_age_restricted", C3426d4.i.W);
                f23565b = Boolean.valueOf(eaA13.f22577a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = f23565b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        map.put("u-age-restricted", zBooleanValue ? "1" : "0");
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    public static String a(String str, String str2, String str3) {
        String string;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = ck.p.l(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() > 0) {
                int length2 = str.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = ck.p.l(str.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                string = str.subSequence(i11, length2 + 1).toString();
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        if (str2 != null) {
            int length3 = str2.length() - 1;
            int i12 = 0;
            boolean z14 = false;
            while (i12 <= length3) {
                boolean z15 = ck.p.l(str2.charAt(!z14 ? i12 : length3), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length3--;
                } else if (z15) {
                    i12++;
                } else {
                    z14 = true;
                }
            }
            if (str2.subSequence(i12, length3 + 1).toString().length() > 0) {
                int length4 = str2.length() - 1;
                int i13 = 0;
                boolean z16 = false;
                while (i13 <= length4) {
                    boolean z17 = ck.p.l(str2.charAt(!z16 ? i13 : length4), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            break;
                        }
                        length4--;
                    } else if (z17) {
                        i13++;
                    } else {
                        z16 = true;
                    }
                }
                string = string + "-" + str2.subSequence(i13, length4 + 1).toString();
            }
        }
        if (str3 == null) {
            return string;
        }
        int length5 = str3.length() - 1;
        int i14 = 0;
        boolean z18 = false;
        while (i14 <= length5) {
            boolean z19 = ck.p.l(str3.charAt(!z18 ? i14 : length5), 32) <= 0;
            if (z18) {
                if (!z19) {
                    break;
                }
                length5--;
            } else if (z19) {
                i14++;
            } else {
                z18 = true;
            }
        }
        if (str3.subSequence(i14, length5 + 1).toString().length() <= 0) {
            return string;
        }
        int length6 = str3.length() - 1;
        int i15 = 0;
        boolean z20 = false;
        while (i15 <= length6) {
            boolean z21 = ck.p.l(str3.charAt(!z20 ? i15 : length6), 32) <= 0;
            if (z20) {
                if (!z21) {
                    break;
                }
                length6--;
            } else if (z21) {
                i15++;
            } else {
                z20 = true;
            }
        }
        return string + "-" + str3.subSequence(i15, length6 + 1).toString();
    }

    public static String a(Location location) {
        return location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + ((int) location.getAccuracy()) + StringUtils.COMMA + location.getTime();
    }
}
