package br.com.zup.pix

import io.grpc.stub.StreamObserver
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class ChavePixGrpcServer : DesafioPixServiceGrpc.DesafioPixServiceImplBase() {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun send(request: DesafioPixRequest?, responseObserver: StreamObserver<DesafioPixReply>?) {

       val reply = DesafioPixReply.newBuilder()
           .setIdCliente(request!!.idCliente)
           .setPixId(request!!.chave)
           .build()

        responseObserver!!.onNext(reply)
        responseObserver.onCompleted()
    }
}