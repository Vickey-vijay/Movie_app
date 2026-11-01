package com.yandex.div.storage;

import ck.i;
import ck.p;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Collection;
import java.util.List;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: RawJsonRepositoryResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RawJsonRepositoryResult {
    public static final Companion Companion = new Companion(null);
    private static final RawJsonRepositoryResult EMPTY = new RawJsonRepositoryResult(s.k(), s.k());
    private final List<RawJsonRepositoryException> errors;
    private final List<RawJson> resultData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawJsonRepositoryResult copy$default(RawJsonRepositoryResult rawJsonRepositoryResult, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rawJsonRepositoryResult.resultData;
        }
        if ((i10 & 2) != 0) {
            list2 = rawJsonRepositoryResult.errors;
        }
        return rawJsonRepositoryResult.copy(list, list2);
    }

    public final RawJsonRepositoryResult copy(List<? extends RawJson> list, List<RawJsonRepositoryException> list2) {
        return new RawJsonRepositoryResult(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryResult)) {
            return false;
        }
        RawJsonRepositoryResult rawJsonRepositoryResult = (RawJsonRepositoryResult) obj;
        return p.e(this.resultData, rawJsonRepositoryResult.resultData) && p.e(this.errors, rawJsonRepositoryResult.errors);
    }

    public int hashCode() {
        return (this.resultData.hashCode() * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "RawJsonRepositoryResult(resultData=" + this.resultData + ", errors=" + this.errors + ')';
    }

    /* JADX INFO: compiled from: RawJsonRepositoryResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final RawJsonRepositoryResult getEMPTY() {
            return RawJsonRepositoryResult.EMPTY;
        }
    }

    public final RawJsonRepositoryResult addData(Collection<? extends RawJson> collection) {
        return copy$default(this, b0.y0(this.resultData, collection), null, 2, null);
    }

    public final List<RawJsonRepositoryException> getErrors() {
        return this.errors;
    }

    public final List<RawJson> getResultData() {
        return this.resultData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawJsonRepositoryResult(List<? extends RawJson> list, List<RawJsonRepositoryException> list2) {
        this.resultData = list;
        this.errors = list2;
    }
}
