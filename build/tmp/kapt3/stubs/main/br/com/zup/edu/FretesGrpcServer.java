package br.com.zup.edu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/edu/FretesGrpcServer;", "Lbr/com/zup/edu/FretesServiceGrpc$FretesServiceImplBase;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "calculaFrete", "", "request", "Lbr/com/zup/edu/CalculaFreteRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/edu/CalculaFreteResponse;", "fretes"})
@javax.inject.Singleton
public final class FretesGrpcServer extends br.com.zup.edu.FretesServiceGrpc.FretesServiceImplBase {
    private final org.slf4j.Logger logger = null;
    
    @java.lang.Override
    public void calculaFrete(@org.jetbrains.annotations.Nullable
    br.com.zup.edu.CalculaFreteRequest request, @org.jetbrains.annotations.Nullable
    io.grpc.stub.StreamObserver<br.com.zup.edu.CalculaFreteResponse> responseObserver) {
    }
    
    public FretesGrpcServer() {
        super();
    }
}