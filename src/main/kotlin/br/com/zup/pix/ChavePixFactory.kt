package br.com.zup.pix

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton


@Factory
class ChavePixFactory {
        //configuração de acesso ao endpoint
    @Singleton
    fun chavePixStub (@GrpcChannel("chave_pix")channel: ManagedChannel ) : DesafioPixServiceGrpc.DesafioPixServiceBlockingStub{
        return DesafioPixServiceGrpc.newBlockingStub(channel)
    }
}