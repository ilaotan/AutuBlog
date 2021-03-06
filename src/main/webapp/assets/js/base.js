layui.define([
    'jquery',
    'NProgress',
    'table'
], function(exports) {
    
    let $=layui.$;

     /**
     *  fl全局函数对象   var fl = new $.fl();
     */
    $.extend({
        fl: function () {
        },
        constant: function () {  
            return {
            }
        }
    });



    $.fl.prototype.isOk = function (data){
        var b= data&&data.state=="ok";
        if(!b&&(!data.isHint)){
            var msg=(data&&data.msg)||'出bug了！';
            this.alertError({title:msg});
        }
        return b;
    }
    /**
     * 成功弹框
     * @param options
     */
    $.fl.prototype.alertOk = function (options) {
        options.title = options.title || '操作成功';
        options.text = options.text;
        options.showCancelButton = false;
        options.showCloseButton = false;
        options.type = 'success';
        this.alertBox(options);
    };

    /**
     * 弹出成功，并在500毫秒后刷新页面
     * @param text
     */
    $.fl.prototype.alertOkAndReload = function (title) {
        this.alertOk({
            title: title, then: function () {
                setTimeout(function () {
                    window.location.reload();
                }, 500);
            }
        });
    };
    /**
     * 警告弹框
     * @param options
     */
    $.fl.prototype.alertWarn = function (options) {
        options = options.length ? {title: options} : ( options || {} );
        options.title = options.title || '警告信息';
        options.text = options.text;
        options.timer = 3000;
        options.type = 'warning';
        this.alertBox(options);
    };

    /**
     * 询问确认弹框，这里会传入then函数进来
     * @param options
     */
    $.fl.prototype.alertConfirm = function (options) {
        options = options || {};
        options.title = options.title || '确定要删除吗？';
        options.text = options.text;
        options.showCancelButton = true;
        options.type = 'question';
        this.alertBox(options);
    };

    /**
     * 错误提示
     * @param options
     */
    $.fl.prototype.alertError = function (options) {
        options = options.length ? {title: options} : ( options || {} );
        options.title = options.title || '错误信息';
        options.text = options.text;
        options.type = 'error';
        this.alertBox(options);
    };


    /**
     * 公共弹框
     * @param options
     */
    $.fl.prototype.alertBox = function (options) {
        swal({
            title: options.title,
            text: options.text,
            type: options.type,
            timer: options.timer || 9999,
            showCloseButton: options.showCloseButton,
            showCancelButton: options.showCancelButton,
            showLoaderOnConfirm: options.showLoaderOnConfirm || false,
            confirmButtonColor: options.confirmButtonColor || '#3085d6',
            cancelButtonColor: options.cancelButtonColor || '#d33',
            confirmButtonText: options.confirmButtonText || '确定',
            cancelButtonText: options.cancelButtonText || '取消'
        }).then(function (e) {
            options.then && options.then(e);
        }).catch(swal.noop);
    };

    /**
     * 封装layui的table
     */
    $.fl.prototype.renderTable=function(options){
        options.parseData=function(res){ //res 即为原始返回的数据\
            var page=res.page;
            var data;
            
            var result={};
            
            result.code=(res.state=="ok"?0:-1);
            result.msg=res.msg;
            
            if(!page){
                result.data=res.list;
            }else{
                result.data=page.list;
                result.count= page.totalRow;
            }
            return result;
            }
        layui.table.render(options);
    }

    /**
     * 全局post函数
     *
     * @param options   参数
     */
    $.fl.prototype.ajax = function (options) {
        NProgress.start();  
        var self = this;
        $.ajax({
            type: options.type||"post",
            url: options.url,
            data: options.data || {},
            async: options.async || false,
            dataType: options.dataType||"json",
            success: function (data) {
            data.isHint=options.isHint;
            if(self.isOk(data)){
                options.success(data);
            }else{
                if(options.fail){
                    options.fail(data);
                } 
            }
            NProgress.done();
            },
            error: function (e) {
                console.log('异常', e);
                if(options.error){
                    options.error();
                }
                NProgress.done();
            }
        });
    };


    $.fl.prototype.isBlank = function (str){
    return( str==null||str.length==0||str==undefined);
    }

    $.fl.prototype.notBlank = function (str){
        return !this.isBlank(str);
    }
    
    $.fl.prototype.objectToArray = function(obj){
        var arr = []; 
        for(var key in obj){ 
            if(!obj.hasOwnProperty(key)){
                continue;
            }
            var item = {}; 
            item["name"]=key;
            item["value"]=obj[key]; 
            arr.push(item); 
        } 
        return arr;
    }

    $.fl.prototype.mergeJson = function(json1,json2){
        for(let sub in json2){
            json1.push({"name":json2[sub].name,"value":json2[sub].value})
        }
        return json1;
    }

    $.fn.serializeJson = function()   
    {   
    var o = {};   
    var a = this.serializeArray();   
    $.each(a, function() {   
        if (o[this.name]) {   
            if (!o[this.name].push) {   
                o[this.name] = [o[this.name]];   
            }   
            o[this.name].push(this.value || '');   
        } else {   
            o[this.name] = this.value || '';   
        }   
    });   
    return o;   
    }; 

    exports("fl",new $.fl());
});
