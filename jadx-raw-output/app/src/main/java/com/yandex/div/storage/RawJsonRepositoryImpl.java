package com.yandex.div.storage;

import androidx.annotation.UiThread;
import bk.l;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nj.b0;
import nj.q0;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: RawJsonRepositoryImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RawJsonRepositoryImpl implements RawJsonRepository {
    private final DivStorage divStorage;
    private final Map<String, RawJson> inMemoryData = new LinkedHashMap();
    private Set<String> jsonIdsWithErrors = q0.f();

    private final RawJsonRepositoryResult loadFromStorage(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        DivStorage.LoadDataResult<RawJson> rawJsons = this.divStorage.readRawJsons(set);
        List<RawJson> listComponent1 = rawJsons.component1();
        arrayList.addAll(toRawJsonRepositoryExceptions(rawJsons.component2()));
        return new RawJsonRepositoryResult(listComponent1, arrayList);
    }

    private final List<RawJsonRepositoryException> toRawJsonRepositoryExceptions(List<? extends StorageException> list) {
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawJsonRepositoryException((StorageException) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @UiThread
    public RawJsonRepositoryResult get(List<String> list) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        if (list.isEmpty()) {
            return RawJsonRepositoryResult.Companion.getEMPTY();
        }
        Set<String> setS0 = b0.S0(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            RawJson rawJson = this.inMemoryData.get(str);
            if (rawJson != null) {
                arrayList.add(rawJson);
                setS0.remove(str);
            }
        }
        if (!(!setS0.isEmpty())) {
            return new RawJsonRepositoryResult(arrayList, s.k());
        }
        RawJsonRepositoryResult rawJsonRepositoryResultLoadFromStorage = loadFromStorage(setS0);
        for (RawJson rawJson2 : rawJsonRepositoryResultLoadFromStorage.getResultData()) {
            this.inMemoryData.put(rawJson2.getId(), rawJson2);
        }
        return rawJsonRepositoryResultLoadFromStorage.addData(arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @UiThread
    public RawJsonRepositoryResult put(RawJsonRepository.Payload payload) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        List<RawJson> jsons = payload.getJsons();
        for (RawJson rawJson : jsons) {
            this.inMemoryData.put(rawJson.getId(), rawJson);
        }
        List<StorageException> errors = this.divStorage.saveRawJsons(jsons, payload.getActionOnError()).getErrors();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(toRawJsonRepositoryExceptions(errors));
        return new RawJsonRepositoryResult(jsons, arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @UiThread
    public RawJsonRepositoryRemoveResult remove(l<? super RawJson, Boolean> lVar) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        DivStorage.RemoveResult removeResultRemoveRawJsons = this.divStorage.removeRawJsons(lVar);
        Set<String> setComponent1 = removeResultRemoveRawJsons.component1();
        List<RawJsonRepositoryException> rawJsonRepositoryExceptions = toRawJsonRepositoryExceptions(removeResultRemoveRawJsons.component2());
        removeFromInMemory(setComponent1);
        return new RawJsonRepositoryRemoveResult(setComponent1, rawJsonRepositoryExceptions);
    }

    public RawJsonRepositoryImpl(DivStorage divStorage) {
        this.divStorage = divStorage;
    }

    private final void removeFromInMemory(Set<String> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }
}
