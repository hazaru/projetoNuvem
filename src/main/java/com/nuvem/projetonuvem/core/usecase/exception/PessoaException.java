package com.nuvem.projetonuvem.core.usecase.exception;

import com.nuvem.projetonuvem.core.util.MessageUtil;

public class PessoaException extends RuntimeException {

    public PessoaException(String message){super(message); }

    public PessoaException(String message, Throwable cause){super(MessageUtil.GET_USECASE_PESSOA_DATAPROVIDER, cause); }

}
