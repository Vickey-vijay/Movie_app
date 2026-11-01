package com.yandex.div.internal.parser;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: TypeHelpers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TypeHelpersKt {
    public static final TypeHelper<Boolean> TYPE_HELPER_BOOLEAN = new TypeHelper<Boolean>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_BOOLEAN$1
        private final boolean typeDefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Boolean getTypeDefault() {
            return Boolean.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof Boolean;
        }
    };
    public static final TypeHelper<Long> TYPE_HELPER_INT = new TypeHelper<Long>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_INT$1
        private final long typeDefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Long getTypeDefault() {
            return Long.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof Long;
        }
    };
    public static final TypeHelper<String> TYPE_HELPER_STRING = new TypeHelper<String>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_STRING$1
        private final String typeDefault = "";

        @Override // com.yandex.div.internal.parser.TypeHelper
        public String getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof String;
        }
    };
    public static final TypeHelper<Double> TYPE_HELPER_DOUBLE = new TypeHelper<Double>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DOUBLE$1
        private final double typeDefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Double getTypeDefault() {
            return Double.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof Double;
        }
    };
    public static final TypeHelper<Uri> TYPE_HELPER_URI = new TypeHelper<Uri>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_URI$1
        private final Uri typeDefault = Uri.EMPTY;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Uri getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof Uri;
        }
    };
    public static final TypeHelper<Integer> TYPE_HELPER_COLOR = new TypeHelper<Integer>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_COLOR$1
        private final int typeDefault = ViewCompat.MEASURED_STATE_MASK;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Integer getTypeDefault() {
            return Integer.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof Integer;
        }
    };
    public static final TypeHelper<JSONArray> TYPE_HELPER_JSON_ARRAY = new TypeHelper<JSONArray>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_JSON_ARRAY$1
        private final JSONArray typeDefault = new JSONArray();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public JSONArray getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof JSONArray;
        }
    };
    public static final TypeHelper<JSONObject> TYPE_HELPER_DICT = new TypeHelper<JSONObject>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DICT$1
        private final JSONObject typeDefault = new JSONObject();

        @Override // com.yandex.div.internal.parser.TypeHelper
        public JSONObject getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(Object obj) {
            return obj instanceof JSONObject;
        }
    };
}
