package io.horizontalsystems.bitcoincore.models

import android.arch.persistence.room.Entity

@Entity
class InvalidTransaction : Transaction {

    constructor()

    constructor(transaction: Transaction, serializedTxInfo: String) {
        uid = transaction.uid
        hash = transaction.hash
        blockHash = transaction.blockHash
        version = transaction.version
        m_nSrcChain = transaction.m_nSrcChain
        m_nDestChain = transaction.m_nDestChain
        lockTime = transaction.lockTime
        timestamp = transaction.timestamp
        order = transaction.order
        isMine = transaction.isMine
        isOutgoing = transaction.isOutgoing
        segwit = transaction.segwit
        status = Status.INVALID
        conflictingTxHash = transaction.conflictingTxHash

        this.serializedTxInfo = serializedTxInfo
    }

}
