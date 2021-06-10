package com.ironman.wiki.serivce;

import com.ironman.wiki.domain.Ebook;
import com.ironman.wiki.domain.EbookExample;
import com.ironman.wiki.mapper.EbookMapper;
import com.ironman.wiki.req.EbookReq;
import com.ironman.wiki.resp.EbookResp;
import com.ironman.wiki.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper ebookMapper;



    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        return CopyUtil.copyList(ebookList,EbookResp.class);
    }
}
