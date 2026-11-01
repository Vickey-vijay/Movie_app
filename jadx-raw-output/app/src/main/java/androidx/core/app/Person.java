package androidx.core.app;

import android.annotation.NonNull;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class Person {
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";

    @Nullable
    public IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;

    @Nullable
    public String mKey;

    @Nullable
    public CharSequence mName;

    @Nullable
    public String mUri;

    @RequiresApi(22)
    public static class Api22Impl {
        @DoNotInline
        public static Person fromPersistableBundle(PersistableBundle persistableBundle) {
            return new Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString("key")).setBot(persistableBundle.getBoolean(Person.IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(Person.IS_IMPORTANT_KEY)).build();
        }

        @DoNotInline
        public static PersistableBundle toPersistableBundle(Person person) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.mName;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", person.mUri);
            persistableBundle.putString("key", person.mKey);
            persistableBundle.putBoolean(Person.IS_BOT_KEY, person.mIsBot);
            persistableBundle.putBoolean(Person.IS_IMPORTANT_KEY, person.mIsImportant);
            return persistableBundle;
        }

        private Api22Impl() {
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        @DoNotInline
        public static Person fromAndroidPerson(android.app.Person person) {
            return new Builder().setName(person.getName()).setIcon(person.getIcon() != null ? IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        @DoNotInline
        public static android.app.Person toAndroidPerson(Person person) {
            return new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setIcon(@android.annotation.Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setKey(@android.annotation.Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@android.annotation.Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@android.annotation.Nullable String str);
            }.setName(person.getName()).setIcon(person.getIcon() != null ? person.getIcon().toIcon() : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        private Api28Impl() {
        }
    }

    public static class Builder {

        @Nullable
        public IconCompat mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;

        @Nullable
        public String mKey;

        @Nullable
        public CharSequence mName;

        @Nullable
        public String mUri;

        public Builder() {
        }

        @androidx.annotation.NonNull
        public Person build() {
            return new Person(this);
        }

        @androidx.annotation.NonNull
        public Builder setBot(boolean z10) {
            this.mIsBot = z10;
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setIcon(@Nullable IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setImportant(boolean z10) {
            this.mIsImportant = z10;
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setKey(@Nullable String str) {
            this.mKey = str;
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setUri(@Nullable String str) {
            this.mUri = str;
            return this;
        }

        public Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String key = getKey();
        String key2 = person.getKey();
        if (key == null && key2 == null) {
            return Objects.equals(Objects.toString(getName()), Objects.toString(person.getName())) && Objects.equals(getUri(), person.getUri()) && Objects.equals(Boolean.valueOf(isBot()), Boolean.valueOf(person.isBot())) && Objects.equals(Boolean.valueOf(isImportant()), Boolean.valueOf(person.isImportant()));
        }
        return Objects.equals(key, key2);
    }

    @androidx.annotation.NonNull
    public static Person fromBundle(@androidx.annotation.NonNull Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new Builder().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString("uri")).setKey(bundle.getString("key")).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    @Nullable
    public IconCompat getIcon() {
        return this.mIcon;
    }

    @Nullable
    public String getKey() {
        return this.mKey;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    @Nullable
    public String getUri() {
        return this.mUri;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    @androidx.annotation.NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String resolveToLegacyUri() {
        String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName == null) {
            return "";
        }
        return "name:" + ((Object) this.mName);
    }

    @androidx.annotation.NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @androidx.annotation.NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.mName);
        IconCompat iconCompat = this.mIcon;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.mUri);
        bundle.putString("key", this.mKey);
        bundle.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle;
    }

    public Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    @androidx.annotation.NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromAndroidPerson(@androidx.annotation.NonNull android.app.Person person) {
        return Api28Impl.fromAndroidPerson(person);
    }

    @androidx.annotation.NonNull
    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromPersistableBundle(@androidx.annotation.NonNull PersistableBundle persistableBundle) {
        return Api22Impl.fromPersistableBundle(persistableBundle);
    }

    public int hashCode() {
        String key = getKey();
        if (key != null) {
            return key.hashCode();
        }
        return Objects.hash(getName(), getUri(), Boolean.valueOf(isBot()), Boolean.valueOf(isImportant()));
    }

    @androidx.annotation.NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person toAndroidPerson() {
        return Api28Impl.toAndroidPerson(this);
    }

    @androidx.annotation.NonNull
    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle toPersistableBundle() {
        return Api22Impl.toPersistableBundle(this);
    }
}
