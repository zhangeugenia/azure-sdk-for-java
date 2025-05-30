// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.mixedreality.authentication;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.UUID;

class MixedRealityAccountKeyCredential implements TokenCredential {
    private final UUID accountId;
    private final AzureKeyCredential keyCredential;

    MixedRealityAccountKeyCredential(UUID accountId, AzureKeyCredential keyCredential) {
        this.accountId = accountId;
        this.keyCredential = keyCredential;
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
        return Mono.fromSupplier(() -> getTokenSync(tokenRequestContext));
    }

    @Override
    public AccessToken getTokenSync(TokenRequestContext request) {
        return new AccessToken(accountId + ":" + keyCredential.getKey(), OffsetDateTime.MAX);
    }
}
