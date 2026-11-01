package w7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: compiled from: FileDownloadProperties.java */
/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f73539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f73541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f73542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f73543h;

    /* JADX INFO: compiled from: FileDownloadProperties.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f73544a = new e();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:104:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:122:0x0211  */
    /* JADX WARN: Code duplicated, block: B:125:0x0217  */
    /* JADX WARN: Code duplicated, block: B:139:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[Catch: all -> 0x0296, TryCatch #8 {all -> 0x0296, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1 A[Catch: all -> 0x0296, TryCatch #8 {all -> 0x0296, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #8 {all -> 0x0296, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x018d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public e() throws Throwable {
        Throwable th2;
        InputStream inputStreamOpen;
        String property;
        String property2;
        String property3;
        String property4;
        String property5;
        String property6;
        String property7;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r10;
        int i10;
        ?? r11;
        String str5;
        String property8;
        if (c.a() == null) {
            throw new IllegalStateException("Please invoke the 'FileDownloader#setup' before using FileDownloader. If you want to register some components on FileDownloader please invoke the 'FileDownloader#setupOnApplicationOnCreate' on the 'Application#onCreate' first.");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Properties properties = new Properties();
        try {
            inputStreamOpen = c.a().getAssets().open("filedownloader.properties");
            if (inputStreamOpen != null) {
                try {
                    try {
                        properties.load(inputStreamOpen);
                        property = properties.getProperty("http.lenient");
                        try {
                            property2 = properties.getProperty("process.non-separate");
                            try {
                                property3 = properties.getProperty("download.min-progress-step");
                                try {
                                    property4 = properties.getProperty("download.min-progress-time");
                                    try {
                                        property5 = properties.getProperty("download.max-network-thread-count");
                                        try {
                                            property6 = properties.getProperty("file.non-pre-allocation");
                                            try {
                                                property7 = properties.getProperty("broadcast.completed");
                                                try {
                                                    str5 = property2;
                                                    property8 = properties.getProperty("download.trial-connection-head-method");
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    if (e instanceof FileNotFoundException) {
                                                        e.printStackTrace();
                                                    } else if (d.f73535a) {
                                                        d.a(e.class, "not found filedownloader.properties", new Object[0]);
                                                    }
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (IOException e11) {
                                                            e11.printStackTrace();
                                                        }
                                                    }
                                                    str = property2;
                                                    str2 = property6;
                                                    str3 = property7;
                                                    property = property;
                                                    str4 = null;
                                                }
                                            } catch (IOException e12) {
                                                e = e12;
                                                property7 = null;
                                                if (e instanceof FileNotFoundException) {
                                                    e.printStackTrace();
                                                } else if (d.f73535a) {
                                                    d.a(e.class, "not found filedownloader.properties", new Object[0]);
                                                }
                                                if (inputStreamOpen != null) {
                                                    inputStreamOpen.close();
                                                }
                                                str = property2;
                                                str2 = property6;
                                                str3 = property7;
                                                property = property;
                                                str4 = null;
                                                if (property == null) {
                                                    if (property.equals("true")) {
                                                    }
                                                    r10 = 0;
                                                    this.f73538c = property.equals("true");
                                                } else {
                                                    r10 = 0;
                                                    this.f73538c = false;
                                                }
                                                if (str == null) {
                                                    if (str.equals("true")) {
                                                    }
                                                    this.f73539d = str.equals("true");
                                                } else {
                                                    this.f73539d = r10;
                                                }
                                                if (property3 != null) {
                                                    this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                                } else {
                                                    this.f73536a = 65536;
                                                }
                                                if (property4 != null) {
                                                    this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                                                } else {
                                                    this.f73537b = 2000L;
                                                }
                                                if (property5 != null) {
                                                    this.f73540e = b(Integer.valueOf(property5).intValue());
                                                    i10 = 3;
                                                } else {
                                                    i10 = 3;
                                                    this.f73540e = 3;
                                                }
                                                if (str2 == null) {
                                                    if (str2.equals("true")) {
                                                    }
                                                    r11 = 0;
                                                    this.f73541f = str2.equals("true");
                                                } else {
                                                    r11 = 0;
                                                    this.f73541f = false;
                                                }
                                                if (str3 == null) {
                                                    if (str3.equals("true")) {
                                                    }
                                                    this.f73542g = str3.equals("true");
                                                } else {
                                                    this.f73542g = r11;
                                                }
                                                if (str4 == null) {
                                                    if (str4.equals("true")) {
                                                    }
                                                    this.f73543h = str4.equals("true");
                                                } else {
                                                    this.f73543h = r11;
                                                }
                                                if (d.f73535a) {
                                                    Object[] objArr = new Object[17];
                                                    objArr[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                                    objArr[1] = "http.lenient";
                                                    objArr[2] = Boolean.valueOf(this.f73538c);
                                                    objArr[3] = "process.non-separate";
                                                    objArr[4] = Boolean.valueOf(this.f73539d);
                                                    objArr[5] = "download.min-progress-step";
                                                    objArr[6] = Integer.valueOf(this.f73536a);
                                                    objArr[7] = "download.min-progress-time";
                                                    objArr[8] = Long.valueOf(this.f73537b);
                                                    objArr[9] = "download.max-network-thread-count";
                                                    objArr[10] = Integer.valueOf(this.f73540e);
                                                    objArr[11] = "file.non-pre-allocation";
                                                    objArr[12] = Boolean.valueOf(this.f73541f);
                                                    objArr[13] = "broadcast.completed";
                                                    objArr[14] = Boolean.valueOf(this.f73542g);
                                                    objArr[15] = "download.trial-connection-head-method";
                                                    objArr[16] = Boolean.valueOf(this.f73543h);
                                                    d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr);
                                                }
                                            }
                                        } catch (IOException e13) {
                                            e = e13;
                                            property6 = null;
                                            property7 = null;
                                            if (e instanceof FileNotFoundException) {
                                                e.printStackTrace();
                                            } else if (d.f73535a) {
                                                d.a(e.class, "not found filedownloader.properties", new Object[0]);
                                            }
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                            str = property2;
                                            str2 = property6;
                                            str3 = property7;
                                            property = property;
                                            str4 = null;
                                            if (property == null) {
                                                if (property.equals("true")) {
                                                }
                                                r10 = 0;
                                                this.f73538c = property.equals("true");
                                            } else {
                                                r10 = 0;
                                                this.f73538c = false;
                                            }
                                            if (str == null) {
                                                if (str.equals("true")) {
                                                }
                                                this.f73539d = str.equals("true");
                                            } else {
                                                this.f73539d = r10;
                                            }
                                            if (property3 != null) {
                                                this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                            } else {
                                                this.f73536a = 65536;
                                            }
                                            if (property4 != null) {
                                                this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                                            } else {
                                                this.f73537b = 2000L;
                                            }
                                            if (property5 != null) {
                                                this.f73540e = b(Integer.valueOf(property5).intValue());
                                                i10 = 3;
                                            } else {
                                                i10 = 3;
                                                this.f73540e = 3;
                                            }
                                            if (str2 == null) {
                                                if (str2.equals("true")) {
                                                }
                                                r11 = 0;
                                                this.f73541f = str2.equals("true");
                                            } else {
                                                r11 = 0;
                                                this.f73541f = false;
                                            }
                                            if (str3 == null) {
                                                if (str3.equals("true")) {
                                                }
                                                this.f73542g = str3.equals("true");
                                            } else {
                                                this.f73542g = r11;
                                            }
                                            if (str4 == null) {
                                                if (str4.equals("true")) {
                                                }
                                                this.f73543h = str4.equals("true");
                                            } else {
                                                this.f73543h = r11;
                                            }
                                            if (d.f73535a) {
                                                Object[] objArr2 = new Object[17];
                                                objArr2[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                                objArr2[1] = "http.lenient";
                                                objArr2[2] = Boolean.valueOf(this.f73538c);
                                                objArr2[3] = "process.non-separate";
                                                objArr2[4] = Boolean.valueOf(this.f73539d);
                                                objArr2[5] = "download.min-progress-step";
                                                objArr2[6] = Integer.valueOf(this.f73536a);
                                                objArr2[7] = "download.min-progress-time";
                                                objArr2[8] = Long.valueOf(this.f73537b);
                                                objArr2[9] = "download.max-network-thread-count";
                                                objArr2[10] = Integer.valueOf(this.f73540e);
                                                objArr2[11] = "file.non-pre-allocation";
                                                objArr2[12] = Boolean.valueOf(this.f73541f);
                                                objArr2[13] = "broadcast.completed";
                                                objArr2[14] = Boolean.valueOf(this.f73542g);
                                                objArr2[15] = "download.trial-connection-head-method";
                                                objArr2[16] = Boolean.valueOf(this.f73543h);
                                                d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr2);
                                            }
                                        }
                                    } catch (IOException e14) {
                                        e = e14;
                                        property5 = null;
                                        property6 = null;
                                        property7 = null;
                                        if (e instanceof FileNotFoundException) {
                                            e.printStackTrace();
                                        } else if (d.f73535a) {
                                            d.a(e.class, "not found filedownloader.properties", new Object[0]);
                                        }
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                        str = property2;
                                        str2 = property6;
                                        str3 = property7;
                                        property = property;
                                        str4 = null;
                                        if (property == null) {
                                            if (property.equals("true")) {
                                            }
                                            r10 = 0;
                                            this.f73538c = property.equals("true");
                                        } else {
                                            r10 = 0;
                                            this.f73538c = false;
                                        }
                                        if (str == null) {
                                            if (str.equals("true")) {
                                            }
                                            this.f73539d = str.equals("true");
                                        } else {
                                            this.f73539d = r10;
                                        }
                                        if (property3 != null) {
                                            this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                        } else {
                                            this.f73536a = 65536;
                                        }
                                        if (property4 != null) {
                                            this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                                        } else {
                                            this.f73537b = 2000L;
                                        }
                                        if (property5 != null) {
                                            this.f73540e = b(Integer.valueOf(property5).intValue());
                                            i10 = 3;
                                        } else {
                                            i10 = 3;
                                            this.f73540e = 3;
                                        }
                                        if (str2 == null) {
                                            if (str2.equals("true")) {
                                            }
                                            r11 = 0;
                                            this.f73541f = str2.equals("true");
                                        } else {
                                            r11 = 0;
                                            this.f73541f = false;
                                        }
                                        if (str3 == null) {
                                            if (str3.equals("true")) {
                                            }
                                            this.f73542g = str3.equals("true");
                                        } else {
                                            this.f73542g = r11;
                                        }
                                        if (str4 == null) {
                                            if (str4.equals("true")) {
                                            }
                                            this.f73543h = str4.equals("true");
                                        } else {
                                            this.f73543h = r11;
                                        }
                                        if (d.f73535a) {
                                            Object[] objArr3 = new Object[17];
                                            objArr3[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                            objArr3[1] = "http.lenient";
                                            objArr3[2] = Boolean.valueOf(this.f73538c);
                                            objArr3[3] = "process.non-separate";
                                            objArr3[4] = Boolean.valueOf(this.f73539d);
                                            objArr3[5] = "download.min-progress-step";
                                            objArr3[6] = Integer.valueOf(this.f73536a);
                                            objArr3[7] = "download.min-progress-time";
                                            objArr3[8] = Long.valueOf(this.f73537b);
                                            objArr3[9] = "download.max-network-thread-count";
                                            objArr3[10] = Integer.valueOf(this.f73540e);
                                            objArr3[11] = "file.non-pre-allocation";
                                            objArr3[12] = Boolean.valueOf(this.f73541f);
                                            objArr3[13] = "broadcast.completed";
                                            objArr3[14] = Boolean.valueOf(this.f73542g);
                                            objArr3[15] = "download.trial-connection-head-method";
                                            objArr3[16] = Boolean.valueOf(this.f73543h);
                                            d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr3);
                                        }
                                    }
                                } catch (IOException e15) {
                                    e = e15;
                                    property4 = null;
                                    property5 = null;
                                    property6 = null;
                                    property7 = null;
                                    if (e instanceof FileNotFoundException) {
                                        e.printStackTrace();
                                    } else if (d.f73535a) {
                                        d.a(e.class, "not found filedownloader.properties", new Object[0]);
                                    }
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                    str = property2;
                                    str2 = property6;
                                    str3 = property7;
                                    property = property;
                                    str4 = null;
                                    if (property == null) {
                                        if (property.equals("true")) {
                                        }
                                        r10 = 0;
                                        this.f73538c = property.equals("true");
                                    } else {
                                        r10 = 0;
                                        this.f73538c = false;
                                    }
                                    if (str == null) {
                                        if (str.equals("true")) {
                                        }
                                        this.f73539d = str.equals("true");
                                    } else {
                                        this.f73539d = r10;
                                    }
                                    if (property3 != null) {
                                        this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                    } else {
                                        this.f73536a = 65536;
                                    }
                                    if (property4 != null) {
                                        this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                                    } else {
                                        this.f73537b = 2000L;
                                    }
                                    if (property5 != null) {
                                        this.f73540e = b(Integer.valueOf(property5).intValue());
                                        i10 = 3;
                                    } else {
                                        i10 = 3;
                                        this.f73540e = 3;
                                    }
                                    if (str2 == null) {
                                        if (str2.equals("true")) {
                                        }
                                        r11 = 0;
                                        this.f73541f = str2.equals("true");
                                    } else {
                                        r11 = 0;
                                        this.f73541f = false;
                                    }
                                    if (str3 == null) {
                                        if (str3.equals("true")) {
                                        }
                                        this.f73542g = str3.equals("true");
                                    } else {
                                        this.f73542g = r11;
                                    }
                                    if (str4 == null) {
                                        if (str4.equals("true")) {
                                        }
                                        this.f73543h = str4.equals("true");
                                    } else {
                                        this.f73543h = r11;
                                    }
                                    if (d.f73535a) {
                                        Object[] objArr4 = new Object[17];
                                        objArr4[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                        objArr4[1] = "http.lenient";
                                        objArr4[2] = Boolean.valueOf(this.f73538c);
                                        objArr4[3] = "process.non-separate";
                                        objArr4[4] = Boolean.valueOf(this.f73539d);
                                        objArr4[5] = "download.min-progress-step";
                                        objArr4[6] = Integer.valueOf(this.f73536a);
                                        objArr4[7] = "download.min-progress-time";
                                        objArr4[8] = Long.valueOf(this.f73537b);
                                        objArr4[9] = "download.max-network-thread-count";
                                        objArr4[10] = Integer.valueOf(this.f73540e);
                                        objArr4[11] = "file.non-pre-allocation";
                                        objArr4[12] = Boolean.valueOf(this.f73541f);
                                        objArr4[13] = "broadcast.completed";
                                        objArr4[14] = Boolean.valueOf(this.f73542g);
                                        objArr4[15] = "download.trial-connection-head-method";
                                        objArr4[16] = Boolean.valueOf(this.f73543h);
                                        d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr4);
                                    }
                                }
                            } catch (IOException e16) {
                                e = e16;
                                property3 = null;
                                property4 = null;
                                property5 = null;
                                property6 = null;
                                property7 = null;
                                if (e instanceof FileNotFoundException) {
                                    e.printStackTrace();
                                } else if (d.f73535a) {
                                    d.a(e.class, "not found filedownloader.properties", new Object[0]);
                                }
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                                str = property2;
                                str2 = property6;
                                str3 = property7;
                                property = property;
                                str4 = null;
                                if (property == null) {
                                    if (property.equals("true")) {
                                    }
                                    r10 = 0;
                                    this.f73538c = property.equals("true");
                                } else {
                                    r10 = 0;
                                    this.f73538c = false;
                                }
                                if (str == null) {
                                    if (str.equals("true")) {
                                    }
                                    this.f73539d = str.equals("true");
                                } else {
                                    this.f73539d = r10;
                                }
                                if (property3 != null) {
                                    this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                } else {
                                    this.f73536a = 65536;
                                }
                                if (property4 != null) {
                                    this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                                } else {
                                    this.f73537b = 2000L;
                                }
                                if (property5 != null) {
                                    this.f73540e = b(Integer.valueOf(property5).intValue());
                                    i10 = 3;
                                } else {
                                    i10 = 3;
                                    this.f73540e = 3;
                                }
                                if (str2 == null) {
                                    if (str2.equals("true")) {
                                    }
                                    r11 = 0;
                                    this.f73541f = str2.equals("true");
                                } else {
                                    r11 = 0;
                                    this.f73541f = false;
                                }
                                if (str3 == null) {
                                    if (str3.equals("true")) {
                                    }
                                    this.f73542g = str3.equals("true");
                                } else {
                                    this.f73542g = r11;
                                }
                                if (str4 == null) {
                                    if (str4.equals("true")) {
                                    }
                                    this.f73543h = str4.equals("true");
                                } else {
                                    this.f73543h = r11;
                                }
                                if (d.f73535a) {
                                    Object[] objArr5 = new Object[17];
                                    objArr5[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                    objArr5[1] = "http.lenient";
                                    objArr5[2] = Boolean.valueOf(this.f73538c);
                                    objArr5[3] = "process.non-separate";
                                    objArr5[4] = Boolean.valueOf(this.f73539d);
                                    objArr5[5] = "download.min-progress-step";
                                    objArr5[6] = Integer.valueOf(this.f73536a);
                                    objArr5[7] = "download.min-progress-time";
                                    objArr5[8] = Long.valueOf(this.f73537b);
                                    objArr5[9] = "download.max-network-thread-count";
                                    objArr5[10] = Integer.valueOf(this.f73540e);
                                    objArr5[11] = "file.non-pre-allocation";
                                    objArr5[12] = Boolean.valueOf(this.f73541f);
                                    objArr5[13] = "broadcast.completed";
                                    objArr5[14] = Boolean.valueOf(this.f73542g);
                                    objArr5[15] = "download.trial-connection-head-method";
                                    objArr5[16] = Boolean.valueOf(this.f73543h);
                                    d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr5);
                                }
                            }
                        } catch (IOException e17) {
                            e = e17;
                            property2 = null;
                            property3 = null;
                            property4 = null;
                            property5 = null;
                            property6 = null;
                            property7 = null;
                            if (e instanceof FileNotFoundException) {
                                e.printStackTrace();
                            } else if (d.f73535a) {
                                d.a(e.class, "not found filedownloader.properties", new Object[0]);
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            str = property2;
                            str2 = property6;
                            str3 = property7;
                            property = property;
                            str4 = null;
                            if (property == null) {
                                if (property.equals("true")) {
                                }
                                r10 = 0;
                                this.f73538c = property.equals("true");
                            } else {
                                r10 = 0;
                                this.f73538c = false;
                            }
                            if (str == null) {
                                if (str.equals("true")) {
                                }
                                this.f73539d = str.equals("true");
                            } else {
                                this.f73539d = r10;
                            }
                            if (property3 != null) {
                                this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                            } else {
                                this.f73536a = 65536;
                            }
                            if (property4 != null) {
                                this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                            } else {
                                this.f73537b = 2000L;
                            }
                            if (property5 != null) {
                                this.f73540e = b(Integer.valueOf(property5).intValue());
                                i10 = 3;
                            } else {
                                i10 = 3;
                                this.f73540e = 3;
                            }
                            if (str2 == null) {
                                if (str2.equals("true")) {
                                }
                                r11 = 0;
                                this.f73541f = str2.equals("true");
                            } else {
                                r11 = 0;
                                this.f73541f = false;
                            }
                            if (str3 == null) {
                                if (str3.equals("true")) {
                                }
                                this.f73542g = str3.equals("true");
                            } else {
                                this.f73542g = r11;
                            }
                            if (str4 == null) {
                                if (str4.equals("true")) {
                                }
                                this.f73543h = str4.equals("true");
                            } else {
                                this.f73543h = r11;
                            }
                            if (d.f73535a) {
                                Object[] objArr6 = new Object[17];
                                objArr6[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                objArr6[1] = "http.lenient";
                                objArr6[2] = Boolean.valueOf(this.f73538c);
                                objArr6[3] = "process.non-separate";
                                objArr6[4] = Boolean.valueOf(this.f73539d);
                                objArr6[5] = "download.min-progress-step";
                                objArr6[6] = Integer.valueOf(this.f73536a);
                                objArr6[7] = "download.min-progress-time";
                                objArr6[8] = Long.valueOf(this.f73537b);
                                objArr6[9] = "download.max-network-thread-count";
                                objArr6[10] = Integer.valueOf(this.f73540e);
                                objArr6[11] = "file.non-pre-allocation";
                                objArr6[12] = Boolean.valueOf(this.f73541f);
                                objArr6[13] = "broadcast.completed";
                                objArr6[14] = Boolean.valueOf(this.f73542g);
                                objArr6[15] = "download.trial-connection-head-method";
                                objArr6[16] = Boolean.valueOf(this.f73543h);
                                d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr6);
                            }
                        }
                    } catch (IOException e18) {
                        e = e18;
                        property = null;
                        property2 = null;
                        property3 = null;
                        property4 = null;
                        property5 = null;
                        property6 = null;
                        property7 = null;
                        if (e instanceof FileNotFoundException) {
                            e.printStackTrace();
                        } else if (d.f73535a) {
                            d.a(e.class, "not found filedownloader.properties", new Object[0]);
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        str = property2;
                        str2 = property6;
                        str3 = property7;
                        property = property;
                        str4 = null;
                        if (property == null) {
                            if (property.equals("true")) {
                            }
                            r10 = 0;
                            this.f73538c = property.equals("true");
                        } else {
                            r10 = 0;
                            this.f73538c = false;
                        }
                        if (str == null) {
                            if (str.equals("true")) {
                            }
                            this.f73539d = str.equals("true");
                        } else {
                            this.f73539d = r10;
                        }
                        if (property3 != null) {
                            this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
                        } else {
                            this.f73536a = 65536;
                        }
                        if (property4 != null) {
                            this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
                        } else {
                            this.f73537b = 2000L;
                        }
                        if (property5 != null) {
                            this.f73540e = b(Integer.valueOf(property5).intValue());
                            i10 = 3;
                        } else {
                            i10 = 3;
                            this.f73540e = 3;
                        }
                        if (str2 == null) {
                            if (str2.equals("true")) {
                            }
                            r11 = 0;
                            this.f73541f = str2.equals("true");
                        } else {
                            r11 = 0;
                            this.f73541f = false;
                        }
                        if (str3 == null) {
                            if (str3.equals("true")) {
                            }
                            this.f73542g = str3.equals("true");
                        } else {
                            this.f73542g = r11;
                        }
                        if (str4 == null) {
                            if (str4.equals("true")) {
                            }
                            this.f73543h = str4.equals("true");
                        } else {
                            this.f73543h = r11;
                        }
                        if (d.f73535a) {
                            Object[] objArr7 = new Object[17];
                            objArr7[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                            objArr7[1] = "http.lenient";
                            objArr7[2] = Boolean.valueOf(this.f73538c);
                            objArr7[3] = "process.non-separate";
                            objArr7[4] = Boolean.valueOf(this.f73539d);
                            objArr7[5] = "download.min-progress-step";
                            objArr7[6] = Integer.valueOf(this.f73536a);
                            objArr7[7] = "download.min-progress-time";
                            objArr7[8] = Long.valueOf(this.f73537b);
                            objArr7[9] = "download.max-network-thread-count";
                            objArr7[10] = Integer.valueOf(this.f73540e);
                            objArr7[11] = "file.non-pre-allocation";
                            objArr7[12] = Boolean.valueOf(this.f73541f);
                            objArr7[13] = "broadcast.completed";
                            objArr7[14] = Boolean.valueOf(this.f73542g);
                            objArr7[15] = "download.trial-connection-head-method";
                            objArr7[16] = Boolean.valueOf(this.f73543h);
                            d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr7);
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (inputStreamOpen == null) {
                        throw th2;
                    }
                    try {
                        inputStreamOpen.close();
                        throw th2;
                    } catch (IOException e19) {
                        e19.printStackTrace();
                        throw th2;
                    }
                }
            } else {
                property = null;
                str5 = null;
                property8 = null;
                property3 = null;
                property4 = null;
                property5 = null;
                property6 = null;
                property7 = null;
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e20) {
                    e20.printStackTrace();
                }
            }
            str = str5;
            str4 = property8;
            str2 = property6;
            str3 = property7;
        } catch (IOException e21) {
            e = e21;
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th2 = th4;
            inputStreamOpen = null;
        }
        if (property == null) {
            r10 = 0;
            this.f73538c = false;
        } else {
            if (property.equals("true") && !property.equals(com.ironsource.mediationsdk.metadata.a.f29886h)) {
                throw new IllegalStateException(f.o("the value of '%s' must be '%s' or '%s'", "http.lenient", "true", com.ironsource.mediationsdk.metadata.a.f29886h));
            }
            r10 = 0;
            this.f73538c = property.equals("true");
        }
        if (str == null) {
            this.f73539d = r10;
        } else {
            if (str.equals("true") && !str.equals(com.ironsource.mediationsdk.metadata.a.f29886h)) {
                Object[] objArr8 = new Object[3];
                objArr8[r10] = "process.non-separate";
                objArr8[1] = "true";
                objArr8[2] = com.ironsource.mediationsdk.metadata.a.f29886h;
                throw new IllegalStateException(f.o("the value of '%s' must be '%s' or '%s'", objArr8));
            }
            this.f73539d = str.equals("true");
        }
        if (property3 != null) {
            this.f73536a = Math.max((int) r10, Integer.valueOf(property3).intValue());
        } else {
            this.f73536a = 65536;
        }
        if (property4 != null) {
            this.f73537b = Math.max(0L, Long.valueOf(property4).longValue());
        } else {
            this.f73537b = 2000L;
        }
        if (property5 != null) {
            this.f73540e = b(Integer.valueOf(property5).intValue());
            i10 = 3;
        } else {
            i10 = 3;
            this.f73540e = 3;
        }
        if (str2 == null) {
            r11 = 0;
            this.f73541f = false;
        } else {
            if (str2.equals("true") && !str2.equals(com.ironsource.mediationsdk.metadata.a.f29886h)) {
                Object[] objArr9 = new Object[i10];
                objArr9[0] = "file.non-pre-allocation";
                objArr9[1] = "true";
                objArr9[2] = com.ironsource.mediationsdk.metadata.a.f29886h;
                throw new IllegalStateException(f.o("the value of '%s' must be '%s' or '%s'", objArr9));
            }
            r11 = 0;
            this.f73541f = str2.equals("true");
        }
        if (str3 == null) {
            this.f73542g = r11;
        } else {
            if (str3.equals("true") && !str3.equals(com.ironsource.mediationsdk.metadata.a.f29886h)) {
                Object[] objArr10 = new Object[3];
                objArr10[r11] = "broadcast.completed";
                objArr10[1] = "true";
                objArr10[2] = com.ironsource.mediationsdk.metadata.a.f29886h;
                throw new IllegalStateException(f.o("the value of '%s' must be '%s' or '%s'", objArr10));
            }
            this.f73542g = str3.equals("true");
        }
        if (str4 == null) {
            this.f73543h = r11;
        } else {
            if (str4.equals("true") && !str4.equals(com.ironsource.mediationsdk.metadata.a.f29886h)) {
                Object[] objArr11 = new Object[3];
                objArr11[r11] = "download.trial-connection-head-method";
                objArr11[1] = "true";
                objArr11[2] = com.ironsource.mediationsdk.metadata.a.f29886h;
                throw new IllegalStateException(f.o("the value of '%s' must be '%s' or '%s'", objArr11));
            }
            this.f73543h = str4.equals("true");
        }
        if (d.f73535a) {
            Object[] objArr12 = new Object[17];
            objArr12[r11] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            objArr12[1] = "http.lenient";
            objArr12[2] = Boolean.valueOf(this.f73538c);
            objArr12[3] = "process.non-separate";
            objArr12[4] = Boolean.valueOf(this.f73539d);
            objArr12[5] = "download.min-progress-step";
            objArr12[6] = Integer.valueOf(this.f73536a);
            objArr12[7] = "download.min-progress-time";
            objArr12[8] = Long.valueOf(this.f73537b);
            objArr12[9] = "download.max-network-thread-count";
            objArr12[10] = Integer.valueOf(this.f73540e);
            objArr12[11] = "file.non-pre-allocation";
            objArr12[12] = Boolean.valueOf(this.f73541f);
            objArr12[13] = "broadcast.completed";
            objArr12[14] = Boolean.valueOf(this.f73542g);
            objArr12[15] = "download.trial-connection-head-method";
            objArr12[16] = Boolean.valueOf(this.f73543h);
            d.e(e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr12);
        }
    }

    public static int b(int i10) {
        if (i10 > 12) {
            d.i(e.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i10), 12, 12);
            return 12;
        }
        if (i10 >= 1) {
            return i10;
        }
        d.i(e.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i10), 1, 1);
        return 1;
    }

    public static e a() {
        return b.f73544a;
    }
}
