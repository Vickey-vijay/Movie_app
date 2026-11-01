package lm;

import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: HttpParser.java */
/* JADX INFO: loaded from: classes.dex */
public class k implements q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final zm.c f63819w = zm.b.a(k.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f63820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Buffers f63821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mm.k f63822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mm.d f63823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mm.d f63824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mm.d f63825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mm.e.a f63826g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f63829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f63831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f63832m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte f63835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f63836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f63837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f63838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f63839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f63840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f63841v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mm.m f63833n = new mm.m();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f63834o = -14;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mm.m.a f63827h = new mm.m.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mm.m.a f63828i = new mm.m.a();

    /* JADX INFO: compiled from: HttpParser.java */
    public static abstract class a {
        public abstract void a(mm.d dVar) throws IOException;

        public abstract void b();

        public abstract void c() throws IOException;

        public abstract void d(long j10) throws IOException;

        public abstract void e(mm.d dVar, mm.d dVar2) throws IOException;

        public abstract void f(mm.d dVar, mm.d dVar2, mm.d dVar3) throws IOException;

        public abstract void g(mm.d dVar, int i10, mm.d dVar2) throws IOException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x0278 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x049c  */
    /* JADX WARN: Code duplicated, block: B:266:0x04a0 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x04a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x04a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x04a8 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x04b2 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:281:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:284:0x04d4 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x04dd A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: HttpException -> 0x0963, TryCatch #1 {HttpException -> 0x0963, blocks: (B:3:0x0004, B:6:0x0009, B:8:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x0021, B:15:0x0029, B:57:0x00d8, B:59:0x00e1, B:60:0x00e9, B:62:0x00f3, B:65:0x00f9, B:66:0x00fc, B:69:0x010a, B:70:0x010e, B:71:0x0113, B:72:0x0114, B:207:0x03a7, B:407:0x076f, B:491:0x08cb, B:29:0x0069, B:31:0x006f, B:33:0x0077, B:35:0x007b, B:36:0x0099, B:40:0x00a1, B:42:0x00a7, B:43:0x00ac, B:47:0x00c2, B:49:0x00c8, B:52:0x00cf, B:53:0x00d4, B:55:0x00d6, B:44:0x00b4, B:45:0x00be, B:25:0x0059), top: B:531:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0196 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public int k() throws IOException {
        HttpException httpException;
        boolean z10;
        IOException iOException;
        int iD;
        int i10;
        int length;
        mm.d dVarH;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        char c10 = 0;
        byte b10 = 0;
        try {
            if (this.f63834o == 0) {
                return 0;
            }
            if (this.f63825f == null) {
                this.f63825f = f();
            }
            int i14 = 1;
            if (this.f63834o == 2) {
                long j12 = this.f63838s;
                if (j12 == this.f63837r) {
                    this.f63834o = 0;
                    this.f63820a.d(j12);
                    return 1;
                }
            }
            int length2 = this.f63825f.length();
            if (length2 == 0) {
                try {
                    iD = d();
                    try {
                        f63819w.i("filled {}/{}", Integer.valueOf(iD), Integer.valueOf(this.f63825f.length()));
                        iOException = null;
                    } catch (IOException e10) {
                        iOException = e10;
                        f63819w.d(toString(), iOException);
                    }
                } catch (IOException e11) {
                    iOException = e11;
                    iD = -1;
                }
                if (iD > 0) {
                    i10 = 1;
                } else {
                    if (iD < 0) {
                        this.f63832m = false;
                        if (this.f63834o > 0 && this.f63825f.length() > 0 && !this.f63841v) {
                            mm.d dVar = this.f63825f;
                            mm.d dVar2 = dVar.get(dVar.length());
                            this.f63838s += (long) dVar2.length();
                            this.f63833n.update(dVar2);
                            this.f63820a.a(dVar2);
                        }
                        int i15 = this.f63834o;
                        if (i15 == 0) {
                            this.f63834o = 0;
                        } else if (i15 == 1) {
                            this.f63834o = 0;
                            this.f63820a.d(this.f63838s);
                        } else if (i15 != 7) {
                            this.f63834o = 0;
                            if (!this.f63841v) {
                                this.f63820a.b();
                            }
                            this.f63820a.d(this.f63838s);
                        } else {
                            this.f63834o = 0;
                        }
                        if (iOException != null) {
                            throw iOException;
                        }
                        if (!isComplete() && !p()) {
                            throw new EofException();
                        }
                        return -1;
                    }
                    i10 = 0;
                }
                length = this.f63825f.length();
            } else {
                length = length2;
                i10 = 0;
            }
            byte[] bArrV = this.f63825f.V();
            int i16 = this.f63834o;
            while (true) {
                int i17 = this.f63834o;
                if (i17 < 0) {
                    int i18 = length - 1;
                    if (length > 0) {
                        if (i16 != i17) {
                            i10++;
                            i16 = i17;
                        }
                        byte b11 = this.f63825f.get();
                        if (this.f63835p != 13) {
                            this.f63835p = b10;
                            try {
                                switch (this.f63834o) {
                                    case -14:
                                        this.f63837r = -3L;
                                        this.f63826g = null;
                                        if (b11 > 32 || b11 < 0) {
                                            this.f63825f.R();
                                            this.f63834o = -13;
                                        }
                                        break;
                                    case -13:
                                        if (b11 == 32) {
                                            this.f63827h.update(this.f63825f.f0(), this.f63825f.getIndex() - 1);
                                            this.f63830k = o.f63861a.c(this.f63827h) == null ? -1 : 0;
                                            this.f63834o = -12;
                                        } else if (b11 < 32 && b11 >= 0) {
                                            throw new HttpException(400);
                                        }
                                        break;
                                    case -12:
                                        if (b11 > 32 || b11 < 0) {
                                            this.f63825f.R();
                                            if (this.f63830k >= 0) {
                                                this.f63834o = -11;
                                                this.f63830k = b11 - 48;
                                            } else {
                                                this.f63834o = -10;
                                            }
                                        } else if (b11 < 32) {
                                            throw new HttpException(400);
                                        }
                                        break;
                                    case -11:
                                        if (b11 == 32) {
                                            this.f63828i.update(this.f63825f.f0(), this.f63825f.getIndex() - 1);
                                            this.f63834o = -9;
                                        } else if (b11 >= 48 && b11 <= 57) {
                                            this.f63830k = (this.f63830k * 10) + (b11 - 48);
                                        } else if (b11 >= 32 || b11 < 0) {
                                            this.f63834o = -10;
                                            this.f63830k = -1;
                                        } else {
                                            this.f63820a.g(j.f63809a.h(this.f63827h), this.f63830k, null);
                                            this.f63835p = b11;
                                            this.f63834o = -5;
                                            mm.m.a aVar = this.f63827h;
                                            aVar.W(aVar.getIndex());
                                            mm.m.a aVar2 = this.f63828i;
                                            aVar2.W(aVar2.getIndex());
                                            this.f63829j = null;
                                        }
                                        break;
                                    case -10:
                                        if (b11 == 32) {
                                            this.f63828i.update(this.f63825f.f0(), this.f63825f.getIndex() - 1);
                                            this.f63834o = -9;
                                        } else if (b11 < 32 && b11 >= 0) {
                                            this.f63820a.f(j.f63809a.h(this.f63827h), this.f63825f.c0(), null);
                                            this.f63832m = false;
                                            this.f63834o = 7;
                                            this.f63820a.c();
                                            this.f63820a.d(this.f63838s);
                                            return 1;
                                        }
                                        break;
                                    case -9:
                                        if (b11 > 32 || b11 < 0) {
                                            this.f63825f.R();
                                            this.f63834o = -6;
                                        } else if (b11 < 32) {
                                            if (this.f63830k <= 0) {
                                                this.f63820a.f(j.f63809a.h(this.f63827h), this.f63828i, null);
                                                this.f63832m = false;
                                                this.f63834o = 7;
                                                this.f63820a.c();
                                                this.f63820a.d(this.f63838s);
                                                return 1;
                                            }
                                            this.f63820a.g(j.f63809a.h(this.f63827h), this.f63830k, null);
                                            this.f63835p = b11;
                                            this.f63834o = -5;
                                            mm.m.a aVar3 = this.f63827h;
                                            aVar3.W(aVar3.getIndex());
                                            mm.m.a aVar4 = this.f63828i;
                                            aVar4.W(aVar4.getIndex());
                                            this.f63829j = null;
                                        }
                                        break;
                                    case AppLovinErrorCodes.INVALID_AD_TOKEN /* -8 */:
                                    case AppLovinErrorCodes.INVALID_ZONE /* -7 */:
                                    default:
                                        break;
                                    case -6:
                                        if (b11 == 13 || b11 == 10) {
                                            if (this.f63830k > 0) {
                                                a aVar5 = this.f63820a;
                                                dVarH = o.f63861a.h(this.f63827h);
                                                aVar5.g(dVarH, this.f63830k, this.f63825f.c0());
                                            } else {
                                                a aVar6 = this.f63820a;
                                                mm.d dVarH2 = j.f63809a.h(this.f63827h);
                                                mm.m.a aVar7 = this.f63828i;
                                                mm.d dVarH3 = o.f63861a.h(this.f63825f.c0());
                                                aVar6.f(dVarH2, aVar7, dVarH3);
                                                dVarH = dVarH3;
                                            }
                                            this.f63835p = b11;
                                            this.f63832m = o.f63861a.f(dVarH) >= 11;
                                            this.f63834o = -5;
                                            mm.m.a aVar8 = this.f63827h;
                                            aVar8.W(aVar8.getIndex());
                                            mm.m.a aVar9 = this.f63828i;
                                            aVar9.W(aVar9.getIndex());
                                            this.f63829j = null;
                                        }
                                        break;
                                    case -5:
                                        if (b11 != 9 && b11 != 32 && b11 != 58) {
                                            if (this.f63826g != null || this.f63827h.length() > 0 || this.f63828i.length() > 0 || this.f63829j != null) {
                                                mm.d dVarH4 = this.f63826g;
                                                if (dVarH4 == null) {
                                                    dVarH4 = i.f63776d.h(this.f63827h);
                                                }
                                                this.f63826g = null;
                                                mm.d hVar = this.f63829j == null ? this.f63828i : new mm.h(this.f63829j);
                                                int iF = i.f63776d.f(dVarH4);
                                                if (iF >= 0) {
                                                    if (iF == i14) {
                                                        int iF2 = h.f63761d.f(hVar);
                                                        if (iF2 == -1) {
                                                            for (String str : hVar.toString().split(StringUtils.COMMA)) {
                                                                int iE = h.f63761d.e(str.trim());
                                                                if (iE == 1) {
                                                                    try {
                                                                        this.f63832m = false;
                                                                    } catch (HttpException e12) {
                                                                        httpException = e12;
                                                                        z10 = 0;
                                                                    }
                                                                    break;
                                                                } else if (iE == 5) {
                                                                    this.f63832m = true;
                                                                }
                                                            }
                                                        } else if (iF2 == 1) {
                                                            this.f63832m = false;
                                                        } else if (iF2 == 5) {
                                                            this.f63832m = true;
                                                        }
                                                    } else if (iF == 5) {
                                                        h hVar2 = h.f63761d;
                                                        hVar = hVar2.h(hVar);
                                                        if (2 == hVar2.f(hVar)) {
                                                            this.f63837r = -2L;
                                                        } else {
                                                            String string = hVar.toString("ISO-8859-1");
                                                            if (string.endsWith("chunked")) {
                                                                this.f63837r = -2L;
                                                            } else if (string.indexOf("chunked") >= 0) {
                                                                throw new HttpException(400, null);
                                                            }
                                                        }
                                                    } else if (iF == 12 && this.f63837r != -2) {
                                                        try {
                                                            long jI = mm.g.i(hVar);
                                                            this.f63837r = jI;
                                                            if (jI <= 0) {
                                                                this.f63837r = 0L;
                                                            }
                                                        } catch (NumberFormatException e13) {
                                                            f63819w.h(e13);
                                                            throw new HttpException(400);
                                                        }
                                                    }
                                                }
                                                this.f63820a.e(dVarH4, hVar);
                                                mm.m.a aVar10 = this.f63827h;
                                                aVar10.W(aVar10.getIndex());
                                                mm.m.a aVar11 = this.f63828i;
                                                aVar11.W(aVar11.getIndex());
                                                this.f63829j = null;
                                            }
                                            this.f63825f.U(-1);
                                            if (b11 != 13 && b11 != 10) {
                                                this.f63836q = 1;
                                                this.f63825f.R();
                                                this.f63834o = -4;
                                                if (bArrV != null) {
                                                    mm.e.a aVarD = i.f63776d.d(bArrV, this.f63825f.f0(), i18 + 1);
                                                    this.f63826g = aVarD;
                                                    if (aVarD != null) {
                                                        this.f63836q = aVarD.length();
                                                        mm.d dVar3 = this.f63825f;
                                                        dVar3.i0(dVar3.f0() + this.f63836q);
                                                        length = this.f63825f.length();
                                                    }
                                                    b10 = 0;
                                                    i14 = 1;
                                                }
                                                break;
                                            }
                                            int i19 = this.f63830k;
                                            if (i19 <= 0 || !(i19 == 304 || i19 == 204 || i19 < 200)) {
                                                if (this.f63837r == -3) {
                                                    if (i19 == 0 || i19 == 304 || i19 == 204 || i19 < 200) {
                                                        j10 = 0;
                                                        this.f63837r = 0L;
                                                    } else {
                                                        this.f63837r = -1L;
                                                    }
                                                }
                                                this.f63838s = j10;
                                                this.f63835p = b11;
                                                if (b11 == 13 && this.f63825f.hasContent() && this.f63825f.peek() == 10) {
                                                    this.f63835p = this.f63825f.get();
                                                }
                                                j11 = this.f63837r;
                                                if (j11 > 2147483647L) {
                                                    i11 = Integer.MAX_VALUE;
                                                } else {
                                                    i11 = (int) j11;
                                                }
                                                if (i11 != -2) {
                                                    this.f63834o = 3;
                                                    this.f63820a.c();
                                                } else if (i11 != -1) {
                                                    this.f63834o = 1;
                                                    this.f63820a.c();
                                                } else {
                                                    if (i11 != 0) {
                                                        if (!this.f63832m || ((i13 = this.f63830k) >= 100 && i13 < 200)) {
                                                            i12 = 0;
                                                        } else {
                                                            i12 = 7;
                                                        }
                                                        this.f63834o = i12;
                                                        this.f63820a.c();
                                                        this.f63820a.d(this.f63838s);
                                                        return 1;
                                                    }
                                                    this.f63834o = 2;
                                                    this.f63820a.c();
                                                }
                                                return 1;
                                            }
                                            this.f63837r = 0L;
                                            j10 = 0;
                                            this.f63838s = j10;
                                            this.f63835p = b11;
                                            if (b11 == 13) {
                                                this.f63835p = this.f63825f.get();
                                            }
                                            j11 = this.f63837r;
                                            if (j11 > 2147483647L) {
                                                i11 = Integer.MAX_VALUE;
                                            } else {
                                                i11 = (int) j11;
                                            }
                                            if (i11 != -2) {
                                                this.f63834o = 3;
                                                this.f63820a.c();
                                            } else if (i11 != -1) {
                                                this.f63834o = 1;
                                                this.f63820a.c();
                                            } else {
                                                if (i11 != 0) {
                                                    if (this.f63832m) {
                                                        i12 = 0;
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                    this.f63834o = i12;
                                                    this.f63820a.c();
                                                    this.f63820a.d(this.f63838s);
                                                    return 1;
                                                }
                                                this.f63834o = 2;
                                                this.f63820a.c();
                                            }
                                            return 1;
                                        }
                                        this.f63836q = -1;
                                        this.f63834o = -2;
                                        break;
                                    case -4:
                                        if (b11 != 9) {
                                            if (b11 == 10 || b11 == 13) {
                                                if (this.f63836q > 0) {
                                                    this.f63827h.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                                }
                                                this.f63835p = b11;
                                                this.f63834o = -5;
                                            } else if (b11 != 32) {
                                                if (b11 != 58) {
                                                    this.f63826g = null;
                                                    if (this.f63836q == -1) {
                                                        this.f63825f.R();
                                                    }
                                                    this.f63836q = this.f63825f.getIndex() - this.f63825f.f0();
                                                    this.f63834o = -3;
                                                } else {
                                                    if (this.f63836q > 0 && this.f63826g == null) {
                                                        this.f63827h.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                                    }
                                                    this.f63836q = -1;
                                                    this.f63834o = -2;
                                                }
                                            }
                                        }
                                        break;
                                    case -3:
                                        if (b11 == 9) {
                                            this.f63834o = -4;
                                        } else if (b11 == 10 || b11 == 13) {
                                            if (this.f63836q > 0) {
                                                this.f63827h.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                            }
                                            this.f63835p = b11;
                                            this.f63834o = -5;
                                        } else if (b11 == 32) {
                                            this.f63834o = -4;
                                        } else if (b11 != 58) {
                                            this.f63826g = null;
                                            this.f63836q += i14;
                                        } else {
                                            if (this.f63836q > 0 && this.f63826g == null) {
                                                this.f63827h.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                            }
                                            this.f63836q = -1;
                                            this.f63834o = -2;
                                        }
                                        break;
                                    case -2:
                                        if (b11 != 9) {
                                            if (b11 == 10 || b11 == 13) {
                                                if (this.f63836q > 0) {
                                                    if (this.f63828i.length() == 0) {
                                                        this.f63828i.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                                    } else {
                                                        if (this.f63829j == null) {
                                                            this.f63829j = this.f63828i.toString("ISO-8859-1");
                                                        }
                                                        this.f63828i.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                                        this.f63829j += Z7.f27998r + this.f63828i.toString("ISO-8859-1");
                                                    }
                                                }
                                                this.f63835p = b11;
                                                this.f63834o = -5;
                                            } else if (b11 != 32) {
                                                if (this.f63836q == -1) {
                                                    this.f63825f.R();
                                                }
                                                this.f63836q = this.f63825f.getIndex() - this.f63825f.f0();
                                                this.f63834o = -1;
                                            }
                                        }
                                        break;
                                    case -1:
                                        if (b11 == 9) {
                                            this.f63834o = -2;
                                        } else if (b11 == 10 || b11 == 13) {
                                            if (this.f63836q > 0) {
                                                if (this.f63828i.length() == 0) {
                                                    this.f63828i.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                                } else {
                                                    if (this.f63829j == null) {
                                                        this.f63829j = this.f63828i.toString("ISO-8859-1");
                                                    }
                                                    this.f63828i.update(this.f63825f.f0(), this.f63825f.f0() + this.f63836q);
                                                    this.f63829j += Z7.f27998r + this.f63828i.toString("ISO-8859-1");
                                                }
                                            }
                                            this.f63835p = b11;
                                            this.f63834o = -5;
                                        } else if (b11 != 32) {
                                            try {
                                                this.f63836q += i14;
                                            } catch (HttpException e14) {
                                                httpException = e14;
                                                z10 = 0;
                                            }
                                        } else {
                                            this.f63834o = -2;
                                        }
                                        break;
                                }
                            } catch (HttpException e15) {
                                e = e15;
                                c10 = '\r';
                                httpException = e;
                                z10 = c10;
                            }
                        } else {
                            if (b11 != 10) {
                                throw new HttpException(400);
                            }
                            this.f63835p = (byte) 10;
                        }
                        length = i18;
                        b10 = 0;
                        i14 = 1;
                    }
                    this.f63832m = z10;
                    this.f63834o = 7;
                    throw httpException;
                }
            }
            int i20 = this.f63830k;
            if (i20 > 0 && this.f63841v) {
                this.f63834o = (this.f63832m || (i20 >= 100 && i20 < 200)) ? 0 : 7;
                this.f63820a.d(this.f63837r);
            }
            int length3 = this.f63825f.length();
            int i21 = this.f63834o;
            while (true) {
                int i22 = this.f63834o;
                if (i22 > 0 && length3 > 0) {
                    if (i21 != i22) {
                        i10++;
                        i21 = i22;
                    }
                    if (this.f63835p == 13 && this.f63825f.peek() == 10) {
                        this.f63835p = this.f63825f.get();
                        length3 = this.f63825f.length();
                    } else {
                        try {
                            this.f63835p = (byte) 0;
                            switch (this.f63834o) {
                                case 1:
                                    mm.d dVar4 = this.f63825f;
                                    mm.d dVar5 = dVar4.get(dVar4.length());
                                    this.f63838s += (long) dVar5.length();
                                    this.f63833n.update(dVar5);
                                    this.f63820a.a(dVar5);
                                    return 1;
                                case 2:
                                    long j13 = this.f63837r;
                                    long j14 = this.f63838s;
                                    long j15 = j13 - j14;
                                    if (j15 == 0) {
                                        this.f63834o = this.f63832m ? 0 : 7;
                                        this.f63820a.d(j14);
                                        return 1;
                                    }
                                    if (length3 > j15) {
                                        length3 = (int) j15;
                                    }
                                    mm.d dVar6 = this.f63825f.get(length3);
                                    this.f63838s += (long) dVar6.length();
                                    this.f63833n.update(dVar6);
                                    this.f63820a.a(dVar6);
                                    long j16 = this.f63838s;
                                    if (j16 != this.f63837r) {
                                        return 1;
                                    }
                                    this.f63834o = this.f63832m ? 0 : 7;
                                    this.f63820a.d(j16);
                                    return 1;
                                case 3:
                                    byte bPeek = this.f63825f.peek();
                                    if (bPeek == 13 || bPeek == 10) {
                                        this.f63835p = this.f63825f.get();
                                    } else if (bPeek <= 32) {
                                        this.f63825f.get();
                                    } else {
                                        this.f63839t = 0;
                                        this.f63840u = 0;
                                        this.f63834o = 4;
                                    }
                                    length3 = this.f63825f.length();
                                    break;
                                case 4:
                                    byte b12 = this.f63825f.get();
                                    if (b12 == 13 || b12 == 10) {
                                        this.f63835p = b12;
                                        if (this.f63839t == 0) {
                                            if (b12 == 13 && this.f63825f.hasContent() && this.f63825f.peek() == 10) {
                                                this.f63835p = this.f63825f.get();
                                            }
                                            this.f63834o = this.f63832m ? 0 : 7;
                                            this.f63820a.d(this.f63838s);
                                            return 1;
                                        }
                                        this.f63834o = 6;
                                    } else {
                                        if (b12 > 32 && b12 != 59) {
                                            if (b12 >= 48 && b12 <= 57) {
                                                this.f63839t = (this.f63839t * 16) + (b12 - 48);
                                            } else if (b12 >= 97 && b12 <= 102) {
                                                this.f63839t = (this.f63839t * 16) + ((b12 + 10) - 97);
                                            } else {
                                                if (b12 < 65 || b12 > 70) {
                                                    throw new IOException("bad chunk char: " + ((int) b12));
                                                }
                                                this.f63839t = (this.f63839t * 16) + ((b12 + 10) - 65);
                                            }
                                            length3 = this.f63825f.length();
                                        }
                                        this.f63834o = 5;
                                    }
                                    length3 = this.f63825f.length();
                                    break;
                                case 5:
                                    byte b13 = this.f63825f.get();
                                    if (b13 == 13 || b13 == 10) {
                                        this.f63835p = b13;
                                        if (this.f63839t == 0) {
                                            if (b13 == 13 && this.f63825f.hasContent() && this.f63825f.peek() == 10) {
                                                this.f63835p = this.f63825f.get();
                                            }
                                            this.f63834o = this.f63832m ? 0 : 7;
                                            this.f63820a.d(this.f63838s);
                                            return 1;
                                        }
                                        this.f63834o = 6;
                                    }
                                    length3 = this.f63825f.length();
                                    break;
                                case 6:
                                    int i23 = this.f63839t - this.f63840u;
                                    if (i23 != 0) {
                                        if (length3 > i23) {
                                            length3 = i23;
                                        }
                                        mm.d dVar7 = this.f63825f.get(length3);
                                        this.f63838s += (long) dVar7.length();
                                        this.f63840u += dVar7.length();
                                        this.f63833n.update(dVar7);
                                        this.f63820a.a(dVar7);
                                        return 1;
                                    }
                                    this.f63834o = 3;
                                    length3 = this.f63825f.length();
                                    break;
                                    break;
                                case 7:
                                    if (this.f63825f.length() > 2) {
                                        this.f63834o = 0;
                                        this.f63822c.close();
                                    } else {
                                        while (this.f63825f.length() > 0) {
                                            if (!Character.isWhitespace(this.f63825f.get())) {
                                                this.f63834o = 0;
                                                this.f63822c.close();
                                                this.f63825f.clear();
                                            }
                                        }
                                    }
                                    this.f63825f.clear();
                                    length3 = this.f63825f.length();
                                    break;
                                default:
                                    length3 = this.f63825f.length();
                                    break;
                            }
                        } catch (HttpException e16) {
                            httpException = e16;
                            z10 = 0;
                        }
                    }
                }
            }
            return i10;
        } catch (HttpException e17) {
            e = e17;
        }
    }

    public String toString() {
        return String.format("%s{s=%d,l=%d,c=%d}", getClass().getSimpleName(), Integer.valueOf(this.f63834o), Integer.valueOf(this.f63836q), Long.valueOf(this.f63837r));
    }

    public int b() throws IOException {
        mm.m mVar = this.f63833n;
        if (mVar != null && mVar.length() > 0) {
            return this.f63833n.length();
        }
        if (this.f63822c.f()) {
            if (this.f63834o <= 0) {
                return 0;
            }
            mm.k kVar = this.f63822c;
            return (!(kVar instanceof nm.b) || ((nm.b) kVar).z().available() <= 0) ? 0 : 1;
        }
        k();
        mm.m mVar2 = this.f63833n;
        if (mVar2 == null) {
            return 0;
        }
        return mVar2.length();
    }

    public mm.d c(long j10) throws IOException {
        mm.k kVar;
        if (this.f63833n.length() > 0) {
            return this.f63833n;
        }
        if (g() <= 0 || j(7)) {
            return null;
        }
        try {
            k();
            while (this.f63833n.length() == 0 && !j(0) && !j(7) && (kVar = this.f63822c) != null && kVar.isOpen()) {
                if (!this.f63822c.f()) {
                    if (k() <= 0) {
                        if (!this.f63822c.k(j10)) {
                            this.f63822c.close();
                            throw new EofException("timeout");
                        }
                    }
                }
                k();
            }
            if (this.f63833n.length() > 0) {
                return this.f63833n;
            }
            return null;
        } catch (IOException e10) {
            this.f63822c.close();
            throw e10;
        }
    }

    public int d() throws IOException {
        mm.d dVar;
        mm.d dVar2;
        if (this.f63825f == null) {
            this.f63825f = f();
        }
        if (this.f63834o > 0) {
            mm.d dVar3 = this.f63825f;
            mm.d dVar4 = this.f63823d;
            if (dVar3 == dVar4 && dVar4 != null && !dVar4.hasContent() && (dVar2 = this.f63824e) != null && dVar2.hasContent()) {
                mm.d dVar5 = this.f63824e;
                this.f63825f = dVar5;
                return dVar5.length();
            }
        }
        mm.d dVar6 = this.f63825f;
        mm.d dVar7 = this.f63823d;
        if (dVar6 == dVar7 && this.f63834o > 0 && dVar7.length() == 0 && ((this.f63831l || this.f63837r - this.f63838s > this.f63823d.e0()) && ((dVar = this.f63824e) != null || this.f63821b != null))) {
            if (dVar == null) {
                this.f63824e = this.f63821b.getBuffer();
            }
            this.f63825f = this.f63824e;
        }
        if (this.f63822c == null) {
            return -1;
        }
        mm.d dVar8 = this.f63825f;
        if (dVar8 == this.f63824e || this.f63834o > 0) {
            dVar8.b0();
        }
        if (this.f63825f.L() == 0) {
            f63819w.g("HttpParser Full for {} ", this.f63822c);
            this.f63825f.clear();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request Entity Too Large: ");
            sb2.append(this.f63825f == this.f63824e ? "body" : "head");
            throw new HttpException(TTAdConstant.VIDEO_INFO_CODE, sb2.toString());
        }
        try {
            return this.f63822c.y(this.f63825f);
        } catch (IOException e10) {
            f63819w.a(e10);
            if (e10 instanceof EofException) {
                throw e10;
            }
            throw new EofException(e10);
        }
    }

    public long e() {
        return this.f63837r;
    }

    public mm.d f() {
        if (this.f63823d == null) {
            mm.d dVarB = this.f63821b.b();
            this.f63823d = dVarB;
            this.f63827h.update(dVarB);
            this.f63828i.update(this.f63823d);
        }
        return this.f63823d;
    }

    public int g() {
        return this.f63834o;
    }

    public boolean h() {
        return this.f63837r == -2;
    }

    public boolean i() throws IOException {
        mm.d dVar;
        mm.d dVar2 = this.f63823d;
        return (dVar2 != null && dVar2.hasContent()) || ((dVar = this.f63824e) != null && dVar.hasContent());
    }

    @Override // lm.q
    public boolean isComplete() {
        if (this.f63830k > 0) {
            return j(0) || j(7);
        }
        return j(0);
    }

    public boolean j(int i10) {
        return this.f63834o == i10;
    }

    public void l(boolean z10) {
        this.f63841v = z10;
    }

    public void m(int i10) {
        this.f63834o = i10;
        this.f63837r = -3L;
    }

    @Override // lm.q
    public boolean p() {
        return j(-14);
    }

    @Override // lm.q
    public void q() {
        Buffers buffers;
        Buffers buffers2;
        mm.d dVar = this.f63824e;
        if (dVar != null && !dVar.hasContent() && this.f63824e.f0() == -1 && (buffers2 = this.f63821b) != null) {
            mm.d dVar2 = this.f63825f;
            mm.d dVar3 = this.f63824e;
            if (dVar2 == dVar3) {
                this.f63825f = this.f63823d;
            }
            if (buffers2 != null) {
                buffers2.a(dVar3);
            }
            this.f63824e = null;
        }
        mm.d dVar4 = this.f63823d;
        if (dVar4 == null || dVar4.hasContent() || this.f63823d.f0() != -1 || (buffers = this.f63821b) == null) {
            return;
        }
        mm.d dVar5 = this.f63825f;
        mm.d dVar6 = this.f63823d;
        if (dVar5 == dVar6) {
            this.f63825f = null;
        }
        buffers.a(dVar6);
        this.f63823d = null;
    }

    @Override // lm.q
    public void r(boolean z10) {
        this.f63832m = z10;
        if (z10) {
            return;
        }
        int i10 = this.f63834o;
        if (i10 == 0 || i10 == -14) {
            this.f63834o = 7;
        }
    }

    @Override // lm.q
    public void reset() {
        int i10;
        mm.d dVar;
        mm.m mVar = this.f63833n;
        mVar.i0(mVar.T());
        if (this.f63832m) {
            i10 = -14;
        } else {
            i10 = this.f63822c.x() ? 0 : 7;
        }
        this.f63834o = i10;
        this.f63837r = -3L;
        this.f63838s = 0L;
        this.f63836q = 0;
        this.f63830k = 0;
        if (this.f63835p == 13 && (dVar = this.f63825f) != null && dVar.hasContent() && this.f63825f.peek() == 10) {
            this.f63835p = this.f63825f.get();
        }
        mm.d dVar2 = this.f63824e;
        if (dVar2 != null && dVar2.hasContent()) {
            mm.d dVar3 = this.f63823d;
            if (dVar3 == null) {
                f();
            } else {
                dVar3.U(-1);
                this.f63823d.b0();
            }
            int iL = this.f63823d.L();
            if (iL > this.f63824e.length()) {
                iL = this.f63824e.length();
            }
            mm.d dVar4 = this.f63824e;
            dVar4.N(dVar4.getIndex(), iL);
            mm.d dVar5 = this.f63824e;
            dVar5.skip(this.f63823d.S(dVar5.N(dVar5.getIndex(), iL)));
        }
        mm.d dVar6 = this.f63823d;
        if (dVar6 != null) {
            dVar6.U(-1);
            this.f63823d.b0();
        }
        mm.d dVar7 = this.f63824e;
        if (dVar7 != null) {
            dVar7.U(-1);
        }
        this.f63825f = this.f63823d;
        q();
    }

    @Override // lm.q
    public boolean s() {
        return this.f63832m;
    }

    public k(Buffers buffers, mm.k kVar, a aVar) {
        this.f63821b = buffers;
        this.f63822c = kVar;
        this.f63820a = aVar;
    }

    @Override // lm.q
    public boolean a() throws IOException {
        boolean z10;
        mm.d dVar;
        boolean z11;
        if (k() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (!isComplete() && (dVar = this.f63825f) != null && dVar.length() > 0 && !this.f63833n.hasContent()) {
            if (k() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
        }
        return z10;
    }
}
