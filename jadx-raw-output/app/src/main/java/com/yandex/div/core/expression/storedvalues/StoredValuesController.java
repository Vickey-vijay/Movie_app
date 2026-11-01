package com.yandex.div.core.expression.storedvalues;

import bk.l;
import ck.p;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.RawJsonRepositoryResult;
import com.yandex.div.storage.rawjson.RawJson;
import io.bidmachine.ads.networks.gam.GAMConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import mj.g;
import nj.b0;
import nj.r;
import org.json.JSONException;
import org.json.JSONObject;
import qe.a;

/* JADX INFO: compiled from: StoredValuesController.kt */
/* JADX INFO: loaded from: classes4.dex */
public class StoredValuesController {
    private final g rawJsonRepository$delegate;

    /* JADX INFO: compiled from: StoredValuesController.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoredValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoredValue.Type.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RawJsonRepository getRawJsonRepository() {
        return (RawJsonRepository) this.rawJsonRepository$delegate.getValue();
    }

    private void logDeclarationFailed(ErrorCollector errorCollector, String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stored value '");
        sb2.append(str);
        sb2.append("' declaration failed: ");
        sb2.append(th2 != null ? th2.getMessage() : null);
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException(sb2.toString(), th2);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private void logUnknownType(ErrorCollector errorCollector, String str, String str2) {
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException("Stored value '" + str + "' declaration failed because of unknown type '" + str2 + '\'', null, 2, null);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private JSONObject toJSONObject(StoredValue storedValue, long j10) throws JSONException {
        Object string;
        if (storedValue instanceof StoredValue.StringStoredValue ? true : storedValue instanceof StoredValue.IntegerStoredValue ? true : storedValue instanceof StoredValue.BooleanStoredValue ? true : storedValue instanceof StoredValue.ArrayStoredValue ? true : storedValue instanceof StoredValue.DictStoredValue ? true : storedValue instanceof StoredValue.DoubleStoredValue) {
            string = storedValue.getValue();
        } else {
            if (!(storedValue instanceof StoredValue.UrlStoredValue ? true : storedValue instanceof StoredValue.ColorStoredValue)) {
                throw new NoWhenBranchMatchedException();
            }
            string = storedValue.getValue().toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(GAMConfig.KEY_EXPIRATION_TIME_SEC, getCurrentTime() + (j10 * ((long) 1000)));
        jSONObject.put("type", StoredValue.Type.Converter.toString(storedValue.getType()));
        jSONObject.put("value", string);
        return jSONObject;
    }

    private StoredValue toStoredValue(JSONObject jSONObject, StoredValue.Type type, String str) throws JSONException {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, jSONObject.getString("value"));
            case 2:
                return new StoredValue.IntegerStoredValue(str, jSONObject.getLong("value"));
            case 3:
                return new StoredValue.BooleanStoredValue(str, jSONObject.getBoolean("value"));
            case 4:
                return new StoredValue.DoubleStoredValue(str, jSONObject.getDouble("value"));
            case 5:
                return new StoredValue.ColorStoredValue(str, Color.Companion.m3378parseC4zCDoM(jSONObject.getString("value")), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, Url.Companion.m3386fromVcSV9u8(jSONObject.getString("value")), null);
            case 7:
                return new StoredValue.ArrayStoredValue(str, jSONObject.getJSONArray("value"));
            case 8:
                return new StoredValue.DictStoredValue(str, jSONObject.getJSONObject("value"));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public StoredValue getStoredValue(String str, ErrorCollector errorCollector) {
        JSONObject data;
        final String str2 = "stored_value_" + str;
        RawJsonRepositoryResult rawJsonRepositoryResult = getRawJsonRepository().get(r.e(str2));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResult.getErrors());
        }
        RawJson rawJson = (RawJson) b0.h0(rawJsonRepositoryResult.getResultData());
        if (rawJson != null && (data = rawJson.getData()) != null) {
            if (data.has(GAMConfig.KEY_EXPIRATION_TIME_SEC)) {
                if (getCurrentTime() >= data.getLong(GAMConfig.KEY_EXPIRATION_TIME_SEC)) {
                    getRawJsonRepository().remove(new l<RawJson, Boolean>() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController.getStoredValue.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public final Boolean invoke(RawJson rawJson2) {
                            return Boolean.valueOf(p.e(rawJson2.getId(), str2));
                        }
                    });
                    return null;
                }
            }
            try {
                String string = data.getString("type");
                StoredValue.Type typeFromString = StoredValue.Type.Converter.fromString(string);
                if (typeFromString != null) {
                    return toStoredValue(data, typeFromString, str);
                }
                logUnknownType(errorCollector, str, string);
                return null;
            } catch (JSONException e10) {
                logDeclarationFailed(errorCollector, str, e10);
            }
        }
        return null;
    }

    public boolean setStoredValue(StoredValue storedValue, long j10, ErrorCollector errorCollector) {
        RawJsonRepositoryResult rawJsonRepositoryResultPut = getRawJsonRepository().put(new RawJsonRepository.Payload(r.e(RawJson.Companion.invoke("stored_value_" + storedValue.getName(), toJSONObject(storedValue, j10))), null, 2, null));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResultPut.getErrors());
        }
        return rawJsonRepositoryResultPut.getErrors().isEmpty();
    }

    public StoredValuesController(final a<? extends DivStorageComponent> aVar) {
        this.rawJsonRepository$delegate = b.a(new bk.a<RawJsonRepository>() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$rawJsonRepository$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final RawJsonRepository invoke() {
                return aVar.get().getRawJsonRepository();
            }
        });
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private void logRepositoryErrors(ErrorCollector errorCollector, List<RawJsonRepositoryException> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            errorCollector.logError((RawJsonRepositoryException) it.next());
        }
    }
}
