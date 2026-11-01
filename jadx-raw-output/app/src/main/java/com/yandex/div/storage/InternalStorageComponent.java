package com.yandex.div.storage;

/* JADX INFO: compiled from: InternalStorageComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InternalStorageComponent implements DivStorageComponent {
    private final RawJsonRepository rawJsonRepository;
    private final DivDataRepository repository;
    private final DivStorage storage;

    @Override // com.yandex.div.storage.DivStorageComponent
    public RawJsonRepository getRawJsonRepository() {
        return this.rawJsonRepository;
    }

    public InternalStorageComponent(DivDataRepository divDataRepository, RawJsonRepository rawJsonRepository, DivStorage divStorage) {
        this.repository = divDataRepository;
        this.rawJsonRepository = rawJsonRepository;
        this.storage = divStorage;
    }
}
