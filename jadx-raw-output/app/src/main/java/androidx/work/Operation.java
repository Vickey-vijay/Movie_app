package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import q5.i;

/* JADX INFO: loaded from: classes7.dex */
public interface Operation {

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.IN_PROGRESS IN_PROGRESS;

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.SUCCESS SUCCESS;

    @NonNull
    i<State.SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();

    public static abstract class State {

        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", this.mThrowable.getMessage());
            }

            @NonNull
            public Throwable getThrowable() {
                return this.mThrowable;
            }

            public FAILURE(@NonNull Throwable th2) {
                this.mThrowable = th2;
            }
        }

        public static final class IN_PROGRESS extends State {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            private IN_PROGRESS() {
            }
        }

        public static final class SUCCESS extends State {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            private SUCCESS() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public State() {
        }
    }

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }
}
