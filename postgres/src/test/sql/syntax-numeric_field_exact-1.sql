SELECT assert(count(*), 1414, 'syntax-numeric_field_exact-1') FROM so_posts WHERE zdb('so_posts', ctid) ==> 'answer_count=0';
