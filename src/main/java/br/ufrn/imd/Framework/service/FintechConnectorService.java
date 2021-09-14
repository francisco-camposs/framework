package br.ufrn.imd.Framework.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class FintechConnectorService {

    @Getter
    protected ConnectorService connectorService;

}
