package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC4202fo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f58343a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f58344a;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        private Builder() {
            this.f58344a = new LinkedList();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC4202fo> userProfileUpdate) {
            this.f58344a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f58344a, 0);
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i10) {
        this(linkedList);
    }

    private UserProfile(LinkedList linkedList) {
        this.f58343a = CollectionUtils.unmodifiableListCopy(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC4202fo>> getUserProfileUpdates() {
        return this.f58343a;
    }
}
