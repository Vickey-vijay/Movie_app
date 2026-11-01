package com.google.gson;

import s5.h;
import s5.l;

/* JADX INFO: loaded from: classes10.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public h serialize(Long l10) {
            return new l(l10);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public h serialize(Long l10) {
            return new l(String.valueOf(l10));
        }
    };

    public abstract h serialize(Long l10);
}
