package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class DivViewState {

    @NonNull
    private final Map<String, BlockState> mBlockStates;
    private final long mCurrentDivStateId;

    public interface BlockState {
    }

    public DivViewState(long j10) {
        this(j10, new ArrayMap());
    }

    public DivViewState(long j10, @NonNull Map<String, BlockState> map) {
        this.mCurrentDivStateId = j10;
        this.mBlockStates = map;
    }

    @Nullable
    public <T extends BlockState> T getBlockState(@NonNull String str) {
        return (T) this.mBlockStates.get(str);
    }

    @NonNull
    public Map<String, BlockState> getBlockStates() {
        return this.mBlockStates;
    }

    public long getCurrentDivStateId() {
        return this.mCurrentDivStateId;
    }

    public <T extends BlockState> void putBlockState(@NonNull String str, @NonNull T t10) {
        this.mBlockStates.put(str, t10);
    }

    public void reset() {
        this.mBlockStates.clear();
    }
}
