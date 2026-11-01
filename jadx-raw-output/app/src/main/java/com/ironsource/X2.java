package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public interface X2 extends Kb<Integer, Integer> {

    public static final class c implements X2 {
        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f27855e;
            } else if (i10 == 207) {
                i11 = b.f27856f;
            } else if (i10 == 405) {
                i11 = 3009;
            } else if (i10 != 406) {
                switch (i10) {
                    case 101:
                        i11 = 83500;
                        break;
                    case 102:
                        i11 = 83510;
                        break;
                    case 103:
                        i11 = d.f27864h;
                        break;
                    case 104:
                        i11 = 83300;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = 83004;
                                break;
                            case 111:
                                break;
                            case 112:
                                i11 = 3305;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 3002;
                                        break;
                                    case 202:
                                        i11 = 3005;
                                        break;
                                    case 203:
                                        i11 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i10);
                                }
                                break;
                        }
                    case 105:
                        i11 = 83302;
                        break;
                }
            } else {
                i11 = 3008;
            }
            return Integer.valueOf(i11);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27848a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27849b = 3009;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27850c = 3008;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27851a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27852b = 3002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27853c = 3005;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f27854d = 3300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f27855e = 3503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f27856f = 3504;

        private b() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27857a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27858b = 83500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27859c = 83510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f27860d = 83300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f27861e = 83302;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f27862f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f27863g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f27864h = 83301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f27865i = 83302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f27866j = 3305;

        private d() {
        }
    }
}
