package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public interface I9 extends Kb<Integer, Integer> {

    public static final class c implements I9 {
        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f26824e;
            } else if (i10 == 207) {
                i11 = b.f26825f;
            } else if (i10 == 401) {
                i11 = 2201;
            } else if (i10 == 410) {
                i11 = a.f26818i;
            } else if (i10 != 411) {
                switch (i10) {
                    case 101:
                        i11 = d.f26828b;
                        break;
                    case 102:
                        i11 = d.f26829c;
                        break;
                    case 103:
                        i11 = d.f26834h;
                        break;
                    case 104:
                        i11 = d.f26830d;
                        break;
                    case 105:
                        i11 = d.f26831e;
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
                                i11 = d.f26835i;
                                break;
                            case 112:
                                i11 = d.f26836j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 2002;
                                        break;
                                    case 202:
                                        i11 = 2003;
                                        break;
                                    case 203:
                                        i11 = 2200;
                                        break;
                                    case 204:
                                        i11 = b.f26826g;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = 2203;
                                                break;
                                            case 404:
                                                i11 = 2005;
                                                break;
                                            case 405:
                                                i11 = a.f26814e;
                                                break;
                                            case 406:
                                                i11 = 2006;
                                                break;
                                            case 407:
                                                i11 = a.f26816g;
                                                break;
                                            case 408:
                                                i11 = a.f26817h;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i10);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i11 = a.f26819j;
            }
            return Integer.valueOf(i11);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26810a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26811b = 2201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f26812c = 2203;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f26813d = 2005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f26814e = 2210;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f26815f = 2006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f26816g = 2204;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f26817h = 2507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f26818i = 2211;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f26819j = 2212;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26820a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26821b = 2002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f26822c = 2003;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f26823d = 2200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f26824e = 2503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f26825f = 2504;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f26826g = 2300;

        private b() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26827a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26828b = 82500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f26829c = 82510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f26830d = 82300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f26831e = 82002;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f26832f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f26833g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f26834h = 82301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f26835i = 82302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f26836j = 82076;

        private d() {
        }
    }
}
