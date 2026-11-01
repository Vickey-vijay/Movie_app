package dagger.hilt.android.internal.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f51911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.Factory f51912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSavedStateViewModelFactory f51913c;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        return this.f51911a.contains(cls.getName()) ? (T) this.f51913c.create(cls) : (T) this.f51912b.create(cls);
    }
}
