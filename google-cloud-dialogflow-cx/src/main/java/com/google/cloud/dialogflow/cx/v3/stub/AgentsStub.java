/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dialogflow.cx.v3.stub;

import static com.google.cloud.dialogflow.cx.v3.AgentsClient.ListAgentsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3.Agent;
import com.google.cloud.dialogflow.cx.v3.CreateAgentRequest;
import com.google.cloud.dialogflow.cx.v3.DeleteAgentRequest;
import com.google.cloud.dialogflow.cx.v3.ExportAgentRequest;
import com.google.cloud.dialogflow.cx.v3.ExportAgentResponse;
import com.google.cloud.dialogflow.cx.v3.GetAgentRequest;
import com.google.cloud.dialogflow.cx.v3.ListAgentsRequest;
import com.google.cloud.dialogflow.cx.v3.ListAgentsResponse;
import com.google.cloud.dialogflow.cx.v3.RestoreAgentRequest;
import com.google.cloud.dialogflow.cx.v3.UpdateAgentRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Dialogflow API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class AgentsStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListAgentsRequest, ListAgentsPagedResponse> listAgentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAgentsPagedCallable()");
  }

  public UnaryCallable<ListAgentsRequest, ListAgentsResponse> listAgentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAgentsCallable()");
  }

  public UnaryCallable<GetAgentRequest, Agent> getAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: getAgentCallable()");
  }

  public UnaryCallable<CreateAgentRequest, Agent> createAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: createAgentCallable()");
  }

  public UnaryCallable<UpdateAgentRequest, Agent> updateAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: updateAgentCallable()");
  }

  public UnaryCallable<DeleteAgentRequest, Empty> deleteAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAgentCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ExportAgentRequest, ExportAgentResponse, Struct>
      exportAgentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportAgentOperationCallable()");
  }

  public UnaryCallable<ExportAgentRequest, Operation> exportAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: exportAgentCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RestoreAgentRequest, Empty, Struct> restoreAgentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreAgentOperationCallable()");
  }

  public UnaryCallable<RestoreAgentRequest, Operation> restoreAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreAgentCallable()");
  }

  @Override
  public abstract void close();
}
