package br.com.zup.edu;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: fretes.proto")
public final class FretesServiceGrpc {

  private FretesServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.FretesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.FretesRequest,
      br.com.zup.edu.FretesReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = br.com.zup.edu.FretesRequest.class,
      responseType = br.com.zup.edu.FretesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.FretesRequest,
      br.com.zup.edu.FretesReply> getSendMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.FretesRequest, br.com.zup.edu.FretesReply> getSendMethod;
    if ((getSendMethod = FretesServiceGrpc.getSendMethod) == null) {
      synchronized (FretesServiceGrpc.class) {
        if ((getSendMethod = FretesServiceGrpc.getSendMethod) == null) {
          FretesServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.FretesRequest, br.com.zup.edu.FretesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.FretesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.FretesReply.getDefaultInstance()))
              .setSchemaDescriptor(new FretesServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.CalculaFreteRequest,
      br.com.zup.edu.CalculaFreteResponse> getCalculaFreteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculaFrete",
      requestType = br.com.zup.edu.CalculaFreteRequest.class,
      responseType = br.com.zup.edu.CalculaFreteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.CalculaFreteRequest,
      br.com.zup.edu.CalculaFreteResponse> getCalculaFreteMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.CalculaFreteRequest, br.com.zup.edu.CalculaFreteResponse> getCalculaFreteMethod;
    if ((getCalculaFreteMethod = FretesServiceGrpc.getCalculaFreteMethod) == null) {
      synchronized (FretesServiceGrpc.class) {
        if ((getCalculaFreteMethod = FretesServiceGrpc.getCalculaFreteMethod) == null) {
          FretesServiceGrpc.getCalculaFreteMethod = getCalculaFreteMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.CalculaFreteRequest, br.com.zup.edu.CalculaFreteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculaFrete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.CalculaFreteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.CalculaFreteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FretesServiceMethodDescriptorSupplier("calculaFrete"))
              .build();
        }
      }
    }
    return getCalculaFreteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FretesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FretesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FretesServiceStub>() {
        @java.lang.Override
        public FretesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FretesServiceStub(channel, callOptions);
        }
      };
    return FretesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FretesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FretesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FretesServiceBlockingStub>() {
        @java.lang.Override
        public FretesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FretesServiceBlockingStub(channel, callOptions);
        }
      };
    return FretesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FretesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FretesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FretesServiceFutureStub>() {
        @java.lang.Override
        public FretesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FretesServiceFutureStub(channel, callOptions);
        }
      };
    return FretesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FretesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(br.com.zup.edu.FretesRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.FretesReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     */
    public void calculaFrete(br.com.zup.edu.CalculaFreteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.CalculaFreteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculaFreteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.FretesRequest,
                br.com.zup.edu.FretesReply>(
                  this, METHODID_SEND)))
          .addMethod(
            getCalculaFreteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.CalculaFreteRequest,
                br.com.zup.edu.CalculaFreteResponse>(
                  this, METHODID_CALCULA_FRETE)))
          .build();
    }
  }

  /**
   */
  public static final class FretesServiceStub extends io.grpc.stub.AbstractAsyncStub<FretesServiceStub> {
    private FretesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FretesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FretesServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(br.com.zup.edu.FretesRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.FretesReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculaFrete(br.com.zup.edu.CalculaFreteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.CalculaFreteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculaFreteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FretesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FretesServiceBlockingStub> {
    private FretesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FretesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FretesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.FretesReply send(br.com.zup.edu.FretesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.edu.CalculaFreteResponse calculaFrete(br.com.zup.edu.CalculaFreteRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculaFreteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FretesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FretesServiceFutureStub> {
    private FretesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FretesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FretesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.FretesReply> send(
        br.com.zup.edu.FretesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.CalculaFreteResponse> calculaFrete(
        br.com.zup.edu.CalculaFreteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculaFreteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_CALCULA_FRETE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FretesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FretesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((br.com.zup.edu.FretesRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.FretesReply>) responseObserver);
          break;
        case METHODID_CALCULA_FRETE:
          serviceImpl.calculaFrete((br.com.zup.edu.CalculaFreteRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.CalculaFreteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FretesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FretesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.Fretes.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FretesService");
    }
  }

  private static final class FretesServiceFileDescriptorSupplier
      extends FretesServiceBaseDescriptorSupplier {
    FretesServiceFileDescriptorSupplier() {}
  }

  private static final class FretesServiceMethodDescriptorSupplier
      extends FretesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FretesServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FretesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FretesServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getCalculaFreteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
