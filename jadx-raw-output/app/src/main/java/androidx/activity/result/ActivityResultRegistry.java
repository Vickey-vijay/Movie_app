package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import ck.i;
import ck.p;
import ck.x;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kk.r;
import kotlin.random.Random;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ActivityResultRegistry {
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private final Map<Integer, String> rcToKey = new LinkedHashMap();
    private final Map<String, Integer> keyToRc = new LinkedHashMap();
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();
    private final List<String> launchedKeys = new ArrayList();
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();
    private final Bundle pendingResults = new Bundle();

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class CallbackAndContract<O> {
        private final ActivityResultCallback<O> callback;
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            p.j(activityResultCallback, "callback");
            p.j(activityResultContract, "contract");
            this.callback = activityResultCallback;
            this.contract = activityResultContract;
        }

        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class LifecycleContainer {
        private final Lifecycle lifecycle;
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(Lifecycle lifecycle) {
            p.j(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void addObserver(LifecycleEventObserver lifecycleEventObserver) {
            p.j(lifecycleEventObserver, "observer");
            this.lifecycle.addObserver(lifecycleEventObserver);
            this.observers.add(lifecycleEventObserver);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            this.observers.clear();
        }

        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }
    }

    @MainThread
    public final boolean dispatchResult(int i10, int i11, Intent intent) {
        String str = this.rcToKey.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        doDispatch(str, i11, intent, this.keyToCallback.get(str));
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i10, ActivityResultContract<I, O> activityResultContract, I i11, ActivityOptionsCompat activityOptionsCompat);

    public final <I, O> ActivityResultLauncher<I> register(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> activityResultContract, final ActivityResultCallback<O> activityResultCallback) {
        p.j(str, C3426d4.i.W);
        p.j(lifecycleOwner, "lifecycleOwner");
        p.j(activityResultContract, "contract");
        p.j(activityResultCallback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            registerKey(str);
            LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(str);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(lifecycle);
            }
            lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.c
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    ActivityResultRegistry.register$lambda$1(this.f3725b, str, activityResultCallback, activityResultContract, lifecycleOwner2, event);
                }
            });
            this.keyToLifecycleContainers.put(str, lifecycleContainer);
            return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.2
                @Override // androidx.activity.result.ActivityResultLauncher
                public ActivityResultContract<I, ?> getContract() {
                    return (ActivityResultContract<I, ?>) activityResultContract;
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void launch(I i10, ActivityOptionsCompat activityOptionsCompat) throws Exception {
                    Object obj = ActivityResultRegistry.this.keyToRc.get(str);
                    Object obj2 = activityResultContract;
                    if (obj != null) {
                        int iIntValue = ((Number) obj).intValue();
                        ActivityResultRegistry.this.launchedKeys.add(str);
                        try {
                            ActivityResultRegistry.this.onLaunch(iIntValue, activityResultContract, i10, activityOptionsCompat);
                            return;
                        } catch (Exception e10) {
                            ActivityResultRegistry.this.launchedKeys.remove(str);
                            throw e10;
                        }
                    }
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void unregister() {
                    ActivityResultRegistry.this.unregister$activity_release(str);
                }
            };
        }
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    private final <O> void doDispatch(String str, int i10, Intent intent, CallbackAndContract<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null || !this.launchedKeys.contains(str)) {
            this.parsedPendingResults.remove(str);
            this.pendingResults.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(i10, intent));
            this.launchedKeys.remove(str);
        }
    }

    private final int generateRandomNumber() {
        for (Number number : r.n(new bk.a<Integer>() { // from class: androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Integer invoke() {
                return Integer.valueOf(Random.Default.nextInt(2147418112) + 65536);
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void registerKey(String str) {
        if (this.keyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
        if (bundle2 != null) {
            this.pendingResults.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    x.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            p.i(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            p.i(str2, "keys[i]");
            bindRcKey(iIntValue, str2);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        p.j(bundle, "outState");
        bundle.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        bundle.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    @MainThread
    public final void unregister$activity_release(String str) {
        Integer numRemove;
        p.j(str, C3426d4.i.W);
        if (!this.launchedKeys.contains(str) && (numRemove = this.keyToRc.remove(str)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(str);
        if (this.parsedPendingResults.containsKey(str)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + this.parsedPendingResults.get(str));
            this.parsedPendingResults.remove(str);
        }
        if (this.pendingResults.containsKey(str)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + ((ActivityResult) BundleCompat.getParcelable(this.pendingResults, str, ActivityResult.class)));
            this.pendingResults.remove(str);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(str);
        }
    }

    private final void bindRcKey(int i10, String str) {
        this.rcToKey.put(Integer.valueOf(i10), str);
        this.keyToRc.put(str, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.j(activityResultRegistry, "this$0");
        p.j(str, "$key");
        p.j(activityResultCallback, "$callback");
        p.j(activityResultContract, "$contract");
        p.j(lifecycleOwner, "<anonymous parameter 0>");
        p.j(event, "event");
        if (Lifecycle.Event.ON_START == event) {
            activityResultRegistry.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
            if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
                Object obj = activityResultRegistry.parsedPendingResults.get(str);
                activityResultRegistry.parsedPendingResults.remove(str);
                activityResultCallback.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(activityResultRegistry.pendingResults, str, ActivityResult.class);
            if (activityResult != null) {
                activityResultRegistry.pendingResults.remove(str);
                activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                return;
            }
            return;
        }
        if (Lifecycle.Event.ON_STOP == event) {
            activityResultRegistry.keyToCallback.remove(str);
        } else if (Lifecycle.Event.ON_DESTROY == event) {
            activityResultRegistry.unregister$activity_release(str);
        }
    }

    @MainThread
    public final <O> boolean dispatchResult(int i10, O o10) {
        String str = this.rcToKey.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, o10);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        p.h(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(o10);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> register(final String str, final ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        p.j(str, C3426d4.i.W);
        p.j(activityResultContract, "contract");
        p.j(activityResultCallback, "callback");
        registerKey(str);
        this.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.parsedPendingResults.containsKey(str)) {
            Object obj = this.parsedPendingResults.get(str);
            this.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.3
            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i10, ActivityOptionsCompat activityOptionsCompat) throws Exception {
                Object obj2 = ActivityResultRegistry.this.keyToRc.get(str);
                Object obj3 = activityResultContract;
                if (obj2 != null) {
                    int iIntValue = ((Number) obj2).intValue();
                    ActivityResultRegistry.this.launchedKeys.add(str);
                    try {
                        ActivityResultRegistry.this.onLaunch(iIntValue, activityResultContract, i10, activityOptionsCompat);
                        return;
                    } catch (Exception e10) {
                        ActivityResultRegistry.this.launchedKeys.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(str);
            }
        };
    }
}
