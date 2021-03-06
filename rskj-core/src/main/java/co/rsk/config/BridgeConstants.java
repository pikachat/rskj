/*
 * This file is part of RskJ
 * Copyright (C) 2017 RSK Labs Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package co.rsk.config;

import co.rsk.bitcoinj.core.*;
import co.rsk.bitcoinj.script.Script;

import java.util.List;

public class BridgeConstants {

    protected String btcParamsString;

    protected List<BtcECKey> federatorPublicKeys;
    protected int federatorsRequiredToSign;
    protected Script federationPubScript;
    protected Address federationAddress;
    // We ignore txs to the federation before this time
    protected long federationAddressCreationTime;

    protected int btc2RskMinimumAcceptableConfirmations;
    protected int rsk2BtcMinimumAcceptableConfirmations;
    protected int btcBroadcastingMinimumAcceptableBlocks;

    protected int updateBridgeExecutionPeriod;

    protected int maxBtcHeadersPerRskBlock;

    protected Coin minimumLockTxValue;
    protected Coin minimumReleaseTxValue;

    public NetworkParameters getBtcParams() {
        return NetworkParameters.fromID(btcParamsString);
    }

    public String getBtcParamsString() {
        return btcParamsString;
    }

    public List<BtcECKey> getFederatorPublicKeys() {
        return federatorPublicKeys;
    }

    public int getFederatorsRequiredToSign() {
        return federatorsRequiredToSign;
    }

    public Script getFederationPubScript() {
        return federationPubScript;
    }

    public Address getFederationAddress() {
        return federationAddress;
    }

    public long getFederationAddressCreationTime() { return federationAddressCreationTime; }

    public int getBtc2RskMinimumAcceptableConfirmations() {
        return btc2RskMinimumAcceptableConfirmations;
    }

    public int getRsk2BtcMinimumAcceptableConfirmations() {
        return rsk2BtcMinimumAcceptableConfirmations;
    }

    public int getBtcBroadcastingMinimumAcceptableBlocks() {
        return btcBroadcastingMinimumAcceptableBlocks;
    }

    
    public int getUpdateBridgeExecutionPeriod() { return updateBridgeExecutionPeriod; }

    public int getMaxBtcHeadersPerRskBlock() { return maxBtcHeadersPerRskBlock; }

    public Coin getMinimumLockTxValue() { return minimumLockTxValue; }

    public Coin getMinimumReleaseTxValue() { return minimumReleaseTxValue; }
}
