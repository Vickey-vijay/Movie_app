package kotlinx.serialization.json.internal;

import ck.p;
import cl.f;
import cl.n;
import com.safedk.android.utils.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.c;
import mj.r;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl.a f63304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63306c;

    public JsonTreeReader(f fVar, dl.a aVar) {
        p.j(fVar, i.f44984c);
        p.j(aVar, "lexer");
        this.f63304a = aVar;
        this.f63305b = fVar.m();
    }

    public final kotlinx.serialization.json.b e() {
        byte bF = this.f63304a.F();
        if (bF == 1) {
            return j(true);
        }
        if (bF == 0) {
            return j(false);
        }
        if (bF == 6) {
            int i10 = this.f63306c + 1;
            this.f63306c = i10;
            kotlinx.serialization.json.b bVarG = i10 == 200 ? g() : i();
            this.f63306c--;
            return bVarG;
        }
        if (bF == 8) {
            return f();
        }
        dl.a.y(this.f63304a, "Cannot begin reading element, unexpected token: " + ((int) bF), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final kotlinx.serialization.json.b f() {
        byte bM = this.f63304a.m();
        if (this.f63304a.F() == 4) {
            dl.a.y(this.f63304a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f63304a.f()) {
            arrayList.add(e());
            bM = this.f63304a.m();
            if (bM != 4) {
                dl.a aVar = this.f63304a;
                boolean z10 = bM == 9;
                int i10 = aVar.f52133a;
                if (!z10) {
                    dl.a.y(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bM == 8) {
            this.f63304a.n((byte) 9);
        } else if (bM == 4) {
            dl.a.y(this.f63304a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public final kotlinx.serialization.json.b g() {
        return (kotlinx.serialization.json.b) kotlin.a.b(new mj.a(new JsonTreeReader$readDeepRecursive$1(this, null)), r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(mj.b<mj.r, kotlinx.serialization.json.b> r21, rj.c<? super kotlinx.serialization.json.b> r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.h(mj.b, rj.c):java.lang.Object");
    }

    public final kotlinx.serialization.json.b i() {
        byte bN = this.f63304a.n((byte) 6);
        if (this.f63304a.F() == 4) {
            dl.a.y(this.f63304a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.f63304a.f()) {
            String strS = this.f63305b ? this.f63304a.s() : this.f63304a.q();
            this.f63304a.n((byte) 5);
            linkedHashMap.put(strS, e());
            bN = this.f63304a.m();
            if (bN != 4) {
                if (bN == 7) {
                    break;
                }
                dl.a.y(this.f63304a, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bN == 6) {
            this.f63304a.n((byte) 7);
        } else if (bN == 4) {
            dl.a.y(this.f63304a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new JsonObject(linkedHashMap);
    }

    public final c j(boolean z10) {
        String strS = (this.f63305b || !z10) ? this.f63304a.s() : this.f63304a.q();
        return (z10 || !p.e(strS, "null")) ? new n(strS, z10, null, 4, null) : JsonNull.INSTANCE;
    }
}
