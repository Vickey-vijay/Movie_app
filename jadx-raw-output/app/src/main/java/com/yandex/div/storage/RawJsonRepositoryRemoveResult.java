package com.yandex.div.storage;

import ck.p;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: RawJsonRepositoryResult.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RawJsonRepositoryRemoveResult {
    private final List<RawJsonRepositoryException> errors;
    private final Set<String> ids;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryRemoveResult)) {
            return false;
        }
        RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult = (RawJsonRepositoryRemoveResult) obj;
        return p.e(this.ids, rawJsonRepositoryRemoveResult.ids) && p.e(this.errors, rawJsonRepositoryRemoveResult.errors);
    }

    public int hashCode() {
        return (this.ids.hashCode() * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
    }

    public RawJsonRepositoryRemoveResult(Set<String> set, List<RawJsonRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }
}
