package com.bello.produto.services;

import com.bello.produto.models.ProdutoModel;
import com.bello.produto.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel add(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> listar() {
        return produtoRepository.findAll();
    }

    public ProdutoModel buscar(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produtoModel) {
        ProdutoModel model = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        model.setNome(produtoModel.getNome());
        model.setPreco(produtoModel.getPreco());
        model.setDescricao(produtoModel.getDescricao());
        model.setStatus(produtoModel.getStatus());

        return produtoRepository.save(model);
    }

    public void deletar(Long id) {
        if (!produtoRepository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado");
        }
        produtoRepository.deleteById(id);
    }
}