package androidx.work;

import ck.p;
import com.ironsource.C3426d4;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: Data.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086\b¢\u0006\u0002\u0010\u0007\u001a!\u0010\b\u001a\u00020\t\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0006*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\b¨\u0006\f"}, d2 = {"workDataOf", "Landroidx/work/Data;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroidx/work/Data;", "hasKeyWithValueOfType", "", "T", C3426d4.i.W, "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        p.j(data, "<this>");
        p.j(str, C3426d4.i.W);
        p.p(4, "T");
        return data.hasKeyWithValueOfType(str, Object.class);
    }

    public static final Data workDataOf(Pair<String, ? extends Object>... pairArr) throws Throwable {
        p.j(pairArr, "pairs");
        Data.Builder builder = new Data.Builder();
        int length = pairArr.length;
        int i10 = 0;
        while (i10 < length) {
            Pair<String, ? extends Object> pair = pairArr[i10];
            i10++;
            builder.put(pair.getFirst(), pair.getSecond());
        }
        Data dataBuild = builder.build();
        p.i(dataBuild, "dataBuilder.build()");
        return dataBuild;
    }
}
